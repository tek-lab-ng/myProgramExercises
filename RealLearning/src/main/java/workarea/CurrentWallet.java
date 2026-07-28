package workarea;

public class CurrentWallet extends Wallet {
    final int charge = 30;

    public CurrentWallet(String walletId, double balance) {
        super(walletId, balance);
    }

    @Override
    public double withdraw(double amount) {
        double balance = super.getBalance();
        if(balance >= amount) {
            if (amount > 0.0) {
                balance = balance - (amount + charge);
                super.setBalance(balance);
            } else {
                System.out.println("WITHDRAW AMOUNT MUST BE GREATER THAN ZERO(0)");
            }
        }else{
            System.out.println("WITHDRAW AMOUNT IS  GREATER THAN AVAILABLE BALANCE");
        }
        return balance;
    }
}
