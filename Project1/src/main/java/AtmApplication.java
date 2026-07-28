//import java.util.Scanner;
//
//public class AtmApplication {
//    double balance = 50000;
//    Scanner scanner = new Scanner(System.in);
//
//    void checkBalance(){
//        System.out.println("Your current balance is: "+balance);
//    }
//
//    void deposit(double depositAmount) {
//        if (depositAmount > 0) {
//            balance = depositAmount + balance;
//            System.out.println(depositAmount + " has been deposited into your account.");
//            checkBalance();
//        } else {
//            System.out.println("Amount must be greater than zero");
//        }
//    }
//    void withdraw(double withdrawalAmount){
//        if (withdrawalAmount <= balance) {
//            balance = balance - withdrawalAmount;
//            System.out.println("Your account has been debited");
//            checkBalance();
//        }else {
//            System.out.println("Insufficient balance!!!");
//        }
//    }
//
//    void transfer(){
//        System.out.println("Enter account number: ");
//        long accountNumber = scanner.nextLong();
//
//        System.out.println("Enter transfer amount");
//        double transferAmount = scanner.nextDouble();
//
//        withdraw(transferAmount);
//    }
//
//    void exit(){
//        System.out.println("Thank you for banking with us.");
//    }
//
//    void atmEngine(){
//        boolean stop = true;
//
//        do {
//            System.out.println("===== ATM MENU =====");
//            System.out.println("1. Check Balance");
//            System.out.println("2. Deposit");
//            System.out.println("3. Withdraw");
//            System.out.println("4. Transfer");
//            System.out.println("5. Exit");
//
//            System.out.println("Choose an option above");
//            int userChoice = scanner.nextInt();
//
//            switch (userChoice){
//                case 1:
//                    checkBalance();
//                    break;
//                case 2:
//                    System.out.println("Enter amount to deposit: ");
//                    double depositAmount = scanner.nextDouble();
//                    deposit(depositAmount);
//                    break;
//                case 3:
//                    System.out.println("Enter withdrawal amount: ");
//                    double withdrawalAmount = scanner.nextDouble();
//                    withdraw(withdrawalAmount);
//                    break;
//
//                case 4:
//                    transfer();
//                    break;
//
//                case 5:
//                    exit();
//                    stop = false;
//                    break;
//
//                default:
//                    System.out.println("Invalid input. Please enter an option between 1 to 5");
//                    break;
//            }
//        }while (stop);
//    }
//
//
//    public static void main(String[] args) {
//        AtmApplication atm = new AtmApplication();
//
////        atm.checkBalance();
////        atm.deposit(10000);
////        atm.withdraw(60000);
////        atm.transfer();
////        atm.exit();
//        atm.atmEngine();
//
//    }
//
//}