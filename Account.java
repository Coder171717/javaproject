import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int CustomerID;
    private int AtmPin;
    private double CurrentAccount = 200000;
    private double SavingAccount = 100000;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public void setCustomerNumber(int CustomerID){
        this.CustomerID = CustomerID;
    }

    public int getCustomerNumber(){
        return CustomerID;
    }

    public void setPinNumber(int pinNumber){
        this.AtmPin = pinNumber;
    }

    public int getPinNumber(){
        return AtmPin;
    }

    public double getCheckingBalance() {
        return CurrentAccount;
    }

    public double getSavingBalance(){
        return SavingAccount;
    }

    public void calcCheckingWithdraw(double amount){
    	CurrentAccount = (CurrentAccount - amount);
    }

    public void calcSavingWithdraw(double amount){
    	SavingAccount = (SavingAccount - amount);
    }

    public void calcCheckingDeposit(double amount){
        CurrentAccount = (CurrentAccount + amount);
    }

    public void calcSavingDeposit(double amount){
        SavingAccount = (SavingAccount + amount);
    }

    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account balance: " + moneyFormat.format(CurrentAccount));
        System.out.print("Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if(CurrentAccount - amount >= 0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(CurrentAccount));
        }
        else{
            System.out.println("Not Enough Money to Withdraw");
        }
    }

    public void getSavingWithdrawInput() {
        System.out.println("Saving Account balance: " + moneyFormat.format(SavingAccount));
        System.out.print("Amount you want to withdraw from Saving Account: ");
        double amount = input.nextDouble();

        if(SavingAccount - amount >= 0){
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account Balance: " + moneyFormat.format(SavingAccount));
        }
        else{
            System.out.println("Not Enough Money to Withdraw");
        }
    }

    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(CurrentAccount));
        System.out.print("Amount you want to deposit to Checking Account: ");
        double amount = input.nextDouble();

        if(CurrentAccount + amount >= 0){
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(CurrentAccount));
        }
        else{
            System.out.println("No Money to Deposit");
        }
    }

    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(SavingAccount));
        System.out.print("Amount you want to deposit to Saving Account: ");
        double amount = input.nextDouble();

        if(CurrentAccount + amount >= 0){
            calcSavingDeposit(amount);
            System.out.println("New Saving Account Balance: " + moneyFormat.format(SavingAccount));
        }
        else{
            System.out.println("No Money to Deposit");
        }
    }

}