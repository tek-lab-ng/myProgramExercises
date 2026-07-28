


public class Digital {

    public static void main(String[] args) {

        System.out.println("Withrawal amount system.");
        payload(2000, 10000, false );

    }

    public static void payload(int withdrawalAmount, int currentwalletBalance, boolean isAccountFrozen){
        if(isAccountFrozen){
            System.out.println(" \"Transaction Denied: Account is frozen.\"");
        } else {
            if (currentwalletBalance >= withdrawalAmount) {
                currentwalletBalance = currentwalletBalance -withdrawalAmount;
                System.out.println("Transaction Successful! New Balance: " + currentwalletBalance);
            } else {
                System.out.println("Transaction Denied: Insufficient funds.");
            }
        }
    }
}
