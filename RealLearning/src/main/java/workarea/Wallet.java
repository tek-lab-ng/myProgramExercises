package workarea;
//We used this class because walletID and balance will change.
//If we used interface, walletID variable will be constant within interface
public abstract class Wallet {

    private String walletId;
    private double balance;

    public Wallet(String walletId, double balance) {
        this.walletId = walletId;
        this.balance = balance;
    }


    //Encapsulation
    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount) {
        double balance = getBalance();
        if (amount > 0.0) {
            balance = balance + amount;
            setBalance(balance);
        } else {
            System.out.println("DEPOSITE AMOUNT MUST BE GREATER THAN ZERO(0)");
        }
        return balance;
    }
    public  double transfer(double amount,  Wallet toWallet) {
        if (amount > 0.0 && getBalance() > amount && toWallet != null) {
            double debitBalance = getBalance() - amount;
            setBalance(debitBalance); // Debit Transaction
            double creditBalance = toWallet.getBalance() + amount;
            toWallet.setBalance(creditBalance); // Credit Transaction
        } else {
            System.out.println("DEPOSITE AMOUNT MUST BE GREATER THAN ZERO(0)");
        }
        return getBalance();
    }
    public abstract double withdraw(double amount);



}
