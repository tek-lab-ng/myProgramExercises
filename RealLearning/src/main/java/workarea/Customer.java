package workarea;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    SavingsWallet savingsWallet ;
    CurrentWallet currentWallet;
    BusinessWallet businessWallet;


    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public SavingsWallet getSavingsWallet() {
        return savingsWallet;
    }

    public void setSavingsWallet(SavingsWallet savingsWallet) {
        this.savingsWallet = savingsWallet;
    }

    public CurrentWallet getCurrentWallet() {
        return currentWallet;
    }

    public void setCurrentWallet(CurrentWallet currentWallet) {
        this.currentWallet = currentWallet;
    }

    public BusinessWallet getBusinessWallet() {
        return businessWallet;
    }

    public void setBusinessWallet(BusinessWallet businessWallet) {
        this.businessWallet = businessWallet;
    }


}
