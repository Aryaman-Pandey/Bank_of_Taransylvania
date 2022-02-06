import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileWriter;
class Deposit
{
    public static void deposit()
    {
        System.out.println();
        System.out.println();
        String s="";StringBuffer old= new StringBuffer();StringBuffer present = new StringBuffer();String cool="";
        int count=0;int index=-1;
        double act;String change="";
        System.out.print("\fENTER YOUR NAME  :  ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.print("ENTER YOUR ACCOUNT NO.  :  ");
        String a1 = new Scanner(System.in).nextLine();
        a1="Account No. : "+a1;
        System.out.print("ENTER THE DEPOSIT AMOUNT  : Rs. ");
        double wa = new Scanner(System.in).nextDouble();
        File f2=new File("bankdetails.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(f2)))
        {
            
          while((s=br.readLine())!=null)   
          {
               if (s.equals(a1))   
                 {
                      count=1;
                 }
               else if(count==1)
               {
                
                    if(s.charAt(s.length()-1)=='.')
                     {   
                         for(int i=0;i<s.length();i++)
                         {
                             if(Character.isDigit(s.charAt(i)))
                             {  index=i;
                                i=s.length();
                                }
                            }
                            act=Double.parseDouble(s.substring(index,s.length()-1))+wa;
                            cool=s.substring(index,s.length());
                            change=Double.toString(act);
                            s="Bank Balance : "+change+".";
                         count=2;}
                }
               old.append(s);
               old.append("\r\n");
          }
          if(count==0)
          {System.out.println();
           System.out.println("                           THE GIVEN ACCOUNT N0. DOES NOT EXIST :(");
            }
        br.close();
        FileOutputStream  ff = new FileOutputStream("bankdetails.txt");
        ff.write(old.toString().getBytes());
        ff.close();
        
        }    
         catch(IOException ioe){
             System.out.println("System Error");
            }
        System.out.println();
        if(count!=0)
        {System.out.println("           DEPOSIT IS SUCSESSFUL");}
        System.out.println("                      ***Thank Y0u***  ");
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
