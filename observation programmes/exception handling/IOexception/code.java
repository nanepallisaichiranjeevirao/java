
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException
    {

      
        try {
            
            FileReader file = new FileReader("file.txt");

            System.out.println(file.read());
        }
      

        catch (Exception exp) {

            System.out.println("Error occured: " + exp.getMessage());
        }
      
        
        finally {
            
            System.out.println( "Finally block will always executed, irrespective of occurence of issue");
        }
    }
}
