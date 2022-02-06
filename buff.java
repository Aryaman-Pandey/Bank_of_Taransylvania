import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class buff
{
    public static void buffwriter(String details)
    {
        File file = new File("bankdetails.txt");
try(FileWriter fr = new FileWriter(file, true))
{
BufferedWriter br = new BufferedWriter(fr);
br.write(details);
br.close();
fr.close();
 }catch(IOException ioe){
         System.out.println("Exception occurred:");
        }
    }
}