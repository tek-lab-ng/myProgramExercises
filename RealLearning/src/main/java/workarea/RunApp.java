package workarea;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args){

        Scanner scanner =new Scanner(System.in);
        System.out.println("Create Customer");
        Customer customer = new Customer("Bello", "Benson");
        SavingsWallet savingsWallet = new SavingsWallet("12345", 100000);
        CurrentWallet currentWallet = new CurrentWallet("54321", 500000);
        BusinessWallet businessWallet = new BusinessWallet("09876", 2000000);


        //Adding wallets to customer
        customer.setSavingsWallet(savingsWallet);
        customer.setCurrentWallet(currentWallet);
        customer.setBusinessWallet(businessWallet);

        //Deposit Transaction
        System.out.println("Old savingsBalance: "+customer.getSavingsWallet().getBalance());
        double savingsBalance = customer.getSavingsWallet().deposit(50);
        System.out.println("New savingsBalance: "+savingsBalance);

        //Withdraw Transaction
        System.out.println("Old CurrentBalance: "+customer.getCurrentWallet().getBalance());
        double currentBalance = customer.getCurrentWallet().withdraw(1000);
        System.out.println("New CurrentBalance: "+currentBalance);

        //Transfer Transaction
        System.out.println("Old BusinessBalance: "+customer.getBusinessWallet().getBalance());
        double businessBalance = customer.getBusinessWallet().transfer(23, customer.getCurrentWallet());
        System.out.println("New BusinessBalance: "+businessBalance);

    }

}
