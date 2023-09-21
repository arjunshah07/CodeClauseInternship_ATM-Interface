import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.text.DecimalFormat;
public class Menu extends Account {
    Scanner minput = new Scanner(System.in);
    DecimalFormat mformat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer , Integer> data = new HashMap<Integer , Integer>();
    public void getlogin () throws IOException {
        int x = 1;
         do {
             try {
                 data.put(12345, 9876);
                 data.put(997863, 6578);
                 System.out.println("Welcome to the ATM Project ");
                 System.out.println("Enter your Customer Number :");
                 setCustomerNumber(minput.nextInt());
                 System.out.println("Enter your PIN Number :");
                 setPinNumber(minput.nextInt());
             } catch (Exception e) {
                 System.out.println("\n" + " Invalid Character(S). Only Number." + "\n");
                 x = 2;
             }
             int cn = getCustomerNumber();
             int pn = getPinNumber();
             if (data.containsKey(cn) && data.get(cn) == pn) {
                 getAccountType();
             } else
                 System.out.println("\n " + "Wrong  Customer Number or Pin Number" + "\n");
         }while(x==1);
         }
         public void getAccountType()
         {
             System.out.println("Select the Account Type");
             System.out.println("Type 1 : Current Account");
             System.out.println("Type 2 : Savings Account");
             System.out.println("Type 3 : Exit");
             System.out.println("Choice: ");
             int selection = minput.nextInt();
             switch(selection) {
                 case 1:
                     getCurrent();
                     break;
                 case 2:
                     getSavings();
                     break;
                 case 3:
                     System.out.println("Thanks for using this ATM service ");
                     break;
                 default:
                     System.out.println("\n" + "Invalid Selection " + "\n");
                     getAccountType();
             }
         }
         public void getCurrent()
         {
             System.out.println("Current Account : ");
             System.out.println(" Type 1 : View Balance");
             System.out.println(" Type 2 : Withdraw Funds");
             System.out.println(" Type 3 : Deposit Funds");
             System.out.println(" Type 4 : Exit");
             System.out.println("Choice : ");
             int selection  = minput.nextInt();
             switch (selection){
                 case 1 :
                     System.out.println("Current Account Balance " + mformat.format(getCurrentBalance()) );
                     getAccountType();
                     break ;
                 case 2 :
                     getCurrentWithdrawInput();
                     getAccountType();;
                     break;
                 case 3 :
                     getCurrentDeposit();
                     getAccountType();
                     break;
                 case 4 :
                     System.out.println("Thanks for using this ATM service ");
                     break;
                 default:
                     System.out.println("\n" + "Invalid Selection " + "\n");
                     getCurrent();
             }
         }
    public void getSavings()
    {
        System.out.println("Savings Account : ");
        System.out.println(" Type 1 : View Balance");
        System.out.println(" Type 2 : Withdraw Funds");
        System.out.println(" Type 3 : Deposit Funds");
        System.out.println(" Type 4 : Exit");
        System.out.println("Choice : ");
        int selection  = minput.nextInt();
        switch (selection){
            case 1 :
                System.out.println("Savings Account Balance " + mformat.format(getSavingsBalance()) );
                getAccountType();
                break ;
            case 2 :
                getSavingsWithdrawInput();
                getAccountType();;
                break;
            case 3 :
                getSavingsDeposit();
                getAccountType();
                break;
            case 4 :
                System.out.println("Thanks for using this ATM service ");
                break;
            default:
                System.out.println("\n" + "Invalid Selection " + "\n");
                getSavings();
        }
    }

}
