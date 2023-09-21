import java.text.DecimalFormat;
import java.util.Scanner;
public class Account {
    private int customerNumber ;
    private int pinNumber ;
    private double CurrentBalance = 0 ;
    private double SavingsBalance = 0 ;
    Scanner inp = new Scanner(System.in);
    DecimalFormat mformat = new DecimalFormat("'$'###,##0.00");
    public int setCustomerNumber(int  customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }
    public int getCustomerNumber(){
        return customerNumber;
    }
    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }
    public int getPinNumber(){
        return pinNumber;
    }
    public double getCurrentBalance(){
        return CurrentBalance;
    }
    public double getSavingsBalance(){
        return SavingsBalance;
    }
    public double calCurrentWithdraw(double amount){
        CurrentBalance = (CurrentBalance - amount);
        return CurrentBalance;
    }
    public double calSavingsWithdraw(double amount){
        SavingsBalance = (SavingsBalance - amount);
        return SavingsBalance;
    }
     public double calCurrentDeposit(double amount){
        CurrentBalance = (CurrentBalance + amount);
        return CurrentBalance;
     }
     public double calSavingsDeposit(double amount ){
        SavingsBalance = (SavingsBalance + amount);
        return SavingsBalance;
     }
     public void getCurrentWithdrawInput(){
         System.out.println("Current Account Balance " + mformat.format(CurrentBalance));
         System.out.println("Amount you have to withdraw :");
         double amount  = inp.nextInt();
         if(CurrentBalance - amount > 0 )
         {
             calCurrentWithdraw(amount);
             System.out.println("Your amount of " + amount + "have been withdrawn successfully.");
             System.out.println("Remaining Balance is :" + CurrentBalance);
         }
         else{
             System.out.println("Invalid Amount ");
         }
     }
    public void getSavingsWithdrawInput(){
        System.out.println("Savings Account Balance " + mformat.format(SavingsBalance));
        System.out.println("Amount you have to withdraw :");
        double amount  = inp.nextInt();
        if(SavingsBalance - amount > 0 )
        {
            calSavingsWithdraw(amount);
            System.out.println("Your amount of " + amount + "have been withdrawn successfully.");
            System.out.println("Remaining Balance is :" + SavingsBalance);
        }
        else{
            System.out.println("Invalid Amount ");
        }
    }
    public void getCurrentDeposit(){
        System.out.println("Current Account Balance " + mformat.format(CurrentBalance));
        System.out.println("Enter amount to deposit ");
        double amount  = inp.nextInt();
        if(CurrentBalance + amount >= 0){
            calCurrentDeposit(amount);
            System.out.println("New Balance after deposit " + CurrentBalance);
        }
        else {
            System.out.println("Invalid Amount ");
        }

    }
    public void getSavingsDeposit(){
        System.out.println("Savings Account Balance " + mformat.format(SavingsBalance));
        System.out.println("Enter amount to deposit ");
        double amount  = inp.nextInt();
        if(SavingsBalance + amount >= 0){
            calSavingsDeposit(amount);
            System.out.println("New Balance after deposit " + SavingsBalance);
        }
        else {
            System.out.println("Invalid Amount ");
        }

    }

}
