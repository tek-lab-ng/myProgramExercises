package Universities;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Worker thread that executes tasks
class Worker extends Thread {
    private final BlockingQueue<Runnable> taskQueue;
    private static final Runnable POISON_PILL = () -> {};

    public Worker(BlockingQueue<Runnable> queue, String name) {
        super(name);
        this.taskQueue = queue;
    }

    public void run() {
        try {
            while (true) {
                Runnable task = taskQueue.take();

                if (task == POISON_PILL) {
                    break; // stop worker
                }

                try {
                    task.run();
                } catch (Exception e) {
                    System.out.println("Task error: " + e.getMessage());
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

// Thread Pool Implementation
class SimpleThreadPool {
    private final BlockingQueue<Runnable> taskQueue;
    private final Worker[] workers;
    private volatile boolean isShutdown = false;
    private static final Runnable POISON_PILL = () -> {};

    public SimpleThreadPool(int poolSize) {
        taskQueue = new LinkedBlockingQueue<>();
        workers = new Worker[poolSize];

        for (int i = 0; i < poolSize; i++) {
            workers[i] = new Worker(taskQueue, "Worker-" + (i + 1));
            workers[i].start();
        }
    }

    // Submit task
    public void submit(Runnable task) throws InterruptedException {
        if (!isShutdown) {
            taskQueue.put(task); // safer than offer()
        } else {
            throw new IllegalStateException("ThreadPool is shutdown");
        }
    }

    // Shutdown pool gracefully
    public void shutdown() {
        isShutdown = true;

        // Send stop signal to all workers
        for (int i = 0; i < workers.length; i++) {
            try {
                taskQueue.put(POISON_PILL);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Wait for workers to finish
        for (Worker worker : workers) {
            try {
                worker.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

// Test Program
class ThreadPoolDemo {
    public static void main(String[] args) {
        SimpleThreadPool pool = new SimpleThreadPool(3);

        try {
            for (int i = 1; i <= 5; i++) {
                int taskId = i;

                pool.submit(() -> {
                    System.out.println("Executing Task " + taskId + " by " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        pool.shutdown();
        System.out.println("All tasks completed.");
    }
}