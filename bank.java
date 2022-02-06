import java.util.*;
class bank
{
    public static void main()
    {
        
        System.out.println();
        System.out.println();
        for(int j =1;j<=1000000000;j++)
            {
            }
        System.out.println(" BANK FACILITIES ARE GIVEN BELOW =>");
        System.out.println();
        for(int j =1;j<=1000000000;j++)
            {
            }
        System.out.println("=>   Enter 1 for Opening an account.");
        System.out.println("=>   Enter 2 for Applying for a loan.");
        System.out.println("=>   Enter 3 for Withdrawal of money.");
        System.out.println("=>   Enter 4 for Deposit of Money.");
        System.out.println("=>   Enter 5 for Applying for cheque.");
        System.out.println("=>   Enter 6 for Viewing Bank Account Details.");
        System.out.println("=>   Enter 7 for Viewing the Bank Policy.");
         for(int j =1;j<=1000000000;j++)
            {
            }
        System.out.println();
        System.out.print("   ENTER YOUR CHOICE: ");
        int c = new Scanner(System.in).nextInt();
        switch(c)
        {
            case 1:{
                Account.account();
                break;
            }
            case 2:{
                loan.loan();
                break;
            }
                case 3:{
                    Withdraw.withdraw();
                    System.out.println("                      ***Thank Y0u***  ");
                    System.out.println("   *@#*@#*@#*@#   HAVE A NICE DAY  *@#*@#*@#*@#" );
                    System.out.print(" ENTER 1 for MAIN MENU and 0 to EXIT =>");
                    int j = new Scanner(System.in).nextInt();
                    System.out.println();
                    System.out.println();
                    if(j == 1)
                    {
                     bank.main();
                    }
                    else if(j == 0)
                    {
                      System.exit(0);
                    }
                    break;
                }
                case 4:{
                    Deposit.deposit();
                    break;
                }
                case 5:{
                    Cheque.cheque();
                    break;
                }
                case 6:{
                    Details.details();
                    break;
                }
                case 7:{
                    Policy.policy();
                    break;
                }
            default:{
                System.out.println("$ORRY !Wr0ng Input");
            }
        }
    }
}