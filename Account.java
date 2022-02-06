import java.util.*;
class Account
{
    public static  void account()
    {
         System.out.println();
         System.out.println();
        System.out.println("\f=>  Enter 1 to Open  A  Savings account");
        System.out.println("=>  Enter 2 to Open A ReOccuring Deposit.");
        System.out.println("=>  Enter 3 to Open A Fixed Deposit");
        System.out.println("=>  Enter 4 to Open A Current Account");
        System.out.println();
        System.out.print("ENTER YOUR CHOICE:  ");
        int c2 = new Scanner(System.in).nextInt();
        String s1="",f1,dob,ad1,pt,acc_no="",details="";
        long mn;double amt=0;
        switch(c2)
        {
            case 1:{
                System.out.println("       SAVINGS ACCOUNT  ");
                System.out.println();
                System.out.print("NAME :   ");
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
                break;
            }
             case 2:{
                System.out.println("       REOCCURING DEPOSIT  ");
                System.out.println();
                System.out.print("NAME :   ");
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
                break;
            }   
            case 3:{
                System.out.println("       FIXED DEPOSIT  ");
                System.out.println();
                System.out.print("NAME :   ");
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
                break;
            }
            case 4:{
                 System.out.println("       CURRENT ACCOUNT  ");
                System.out.println();
                System.out.print("NAME :   ");
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
                break;
            }
            default:{
                System.out.println(" SORRY! Wr0ng Input");
            }
        }
        for(int i=0;i<13;i++)
        {
           int index = (int)(10* Math.random()); 
           acc_no=acc_no+"0123456789".charAt(index);     
        }
        System.out.print(" Please Wait Generating Account No.");
        for(int j =1;j<=1000000000;j++)
            {
            }
            System.out.print(".");
            for(int j =1;j<=1000000000;j++)
            {
            }
            System.out.print(".");
            for(int j =1;j<=1000000000;j++)
            {
            }
        System.out.print(".");
        System.out.println();
        System.out.println("\fYour Account No. Is =>"+acc_no);
        System.out.println("*** THANK YOU***");
        System.out.println("    Your Account Has Been Opened.");
        System.out.println("   *@#*@#*@#*@#   HAVE A NICE DAY  *@#*@#*@#*@#" );
        System.out.println();
        details="\r\nAccount No. : "+acc_no+"\r\n"+"Account Holder's Name : "+s1+"\r\n"+"Bank Balance : "+amt+"."+"\r\n";
        buff.buffwriter(details);
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
                
    

 
    
