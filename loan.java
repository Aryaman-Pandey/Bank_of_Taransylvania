import java.util.*;
class loan
{
    public static void loan()
    {
        String s1,f1,dob,ad1,pt;
        long mn;double amt;
        System.out.println();
        System.out.println();
        System.out.print("\fNAME :   ");
                s1 = new Scanner(System.in).nextLine();
                System.out.print("FATHER'S NAME :   ");
                f1 = new Scanner(System.in).nextLine();
                System.out.print("DATE OF BIRTH :   ");
                dob = new Scanner(System.in).nextLine();
                System.out.print("AADHAR I.D :   ");
                ad1 = new Scanner(System.in).nextLine();
                System.out.print("ADDRESS :   ");
                pt = new Scanner(System.in).nextLine();
                System.out.print("MOBILE NO. :   ");
                mn = new Scanner(System.in).nextLong();
                System.out.print("AMOUNT : Rs.  ");
                amt = new Scanner(System.in).nextDouble();
                System.out.print(" ENTER THE TYPE OF LOAN(home loan,education loan,car loan etc.)  :   ");
                String tl = new Scanner(System.in).nextLine();
                System.out.println();
                System.out.println("          *** THANK YOU***");
                System.out.println("                Your Loan Has Been Granted.");
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
        
        