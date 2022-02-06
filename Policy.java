import java.util.*;
class Policy
{
    public static void policy()
    {
        System.out.println();
        System.out.println();
        System.out.println("\f     **************************************************************************  BANK P0LICY  **************************************************************************");
        System.out.println();
        System.out.println("==========================================================================================================================================================================");
        System.out.println();
        System.out.println(" 1. The Bank Provides interest as f0ll0ws f0r v@riou& @ccount$");
        System.out.println("=>     Savings Account - 5%");
        System.out.println("=>     Reoccuring Deposit - 9%");
        System.out.println("=>     Fixed Deposit      -  8.5%-9%" );
        System.out.println();
        System.out.println(" 2. The Loans Provided are as f0ll0ws: ");
        System.out.println("=>     HOME LOAN");
        System.out.println("=>     VEHICLE LOAN");
        System.out.println("=>     Education LOAN" );
        System.out.println("=>     Buisness LOAN" );
        System.out.println("=>     Marriage LOAN" );
        System.out.println();
        System.out.println(" 3. Message will be sent to the Mobile no. after Every Deposit. ");
        System.out.println();
        System.out.println(" 4. Message will be sent to the Mobile no. after Each Withdrawal.");
        System.out.println();
        System.out.println(" 5. Cheque shall only be approved if the customer has already an account opened in the bank. ");
        System.out.println();
        System.out.println();
        System.out.println("                    ***THANK YOU***  ");
        System.out.println("                          For Viewing The Bank Policy.  " );
        System.out.println("   *@#*@#*@#*@#   HAVE A NICE DAY  *@#*@#*@#*@#" );
        System.out.println();
         System.out.print(" ENTER 1 for MAIN MENU and 0 to EXIT =>");
        int j = new Scanner(System.in).nextInt();
        if(j == 1)
        {
            bank.main();
        }
        else if(j == 0)
        {
            System.exit(0);
        }
    }
}
        
        
        