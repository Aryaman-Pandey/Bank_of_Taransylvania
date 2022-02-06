import java.util.*;
class Cheque
{
    public static void cheque()
    {
        System.out.println();
        System.out.println();
        System.out.print("AADHAR I.D :   ");
        String ad1 = new Scanner(System.in).nextLine();     
        System.out.print("MOBILE NO. :   ");
        long mn = new Scanner(System.in).nextLong();
        Withdraw.withdraw();
        if(Withdraw.count==0)
        {
         System.out.println("     YOUR CHEQUE REQUEST HAS BEEN DECLINED");
        }
        else
        {
         System.out.println("      YOUR CHEQUE HAS BEEN APPROVED");   
        }
        System.out.println("                        *** THANK YOU***");
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
               