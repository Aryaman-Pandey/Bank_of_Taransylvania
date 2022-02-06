import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
class Details
{
    public static  void details()
    {
      String words[]=null;   
      String s;
      System.out.print("\fEnter The Account No. => ");
      String input= new Scanner(System.in).nextLine();
      input="Account No. : "+input;
      int count=0;   
      System.out.println("\f");
      File f1=new File("bankdetails.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(f1)))
        {
        while((s=br.readLine())!=null)   
        { 
         
                 if (s.equals(input))   
                 {
              
                    count=1;
                 }
                 if(count==1)
                 {
                     System.out.println(s);
                     if(s.charAt(s.length()-1)=='.')
                     { count=2;}
                 }
        }
        if(count==0)  
        {
         System.out.println("\fThe Given Account Does Not Exist");
        }
         br.close();
        }    
         catch(IOException ioe){
             System.out.println("System Error");
            }
        System.out.print(" ENTER 1 for MAIN MENU and 0 to EXIT => ");
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

