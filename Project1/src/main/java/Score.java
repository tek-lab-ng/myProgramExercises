import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.*;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Score {

    static int[] student = new int[5];

    public static void main(String[] args) {

        System.out.println("Kindly enter the score value for 5 student in array: ");
        Scanner entry = new Scanner(System.in);

        for (int i = 0; i < student.length; i++) {
            student[i] = entry.nextInt();
        }
        System.out.println("The total score for all student is: " + sumTotal());
        System.out.println("The total average for all student is: " + totalAverage());
        System.out.println("The largest score for the student is: " + largestScore());
        System.out.println("The minimum score from student score is: " + lowestScore());


    }

    static int sumTotal(){
        int sum = 0;
        for(int num: student)
            sum += num;
        return sum;
    }

    static int totalAverage(){
        int average;
        average = sumTotal() / student.length;
        return average;
    }

    static int largestScore(){
        int max = student[0];
        for (int j : student) {
            if (j >= max)
                max = j;
        }
        return max;
    }

    static int lowestScore(){
        int min = student[0];
        for (int j : student) {
            if (j <= min)
                min = j;
        }
        return min;
    }


}
