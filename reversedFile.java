package labs;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class reversedFile {

    public static void main(String[] args) {

        
        
        try 
        {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("third.txt"));
            String line;
            
            
            while((line=reader.readLine())!=null)
            {
                //String reversedLine="";
                String[] list = line.split(" ");
                for(int i=0;i<list.length;i++)
                {
                    String reversedWord="";
                    String temp = list[i];
                    for(int j=temp.length()-1;j>=0;j--)
                    {
                        reversedWord+= temp.charAt(j);
                    }
                    writer.write(reversedWord + " ");
                }
                writer.newLine();
                
                // for(int i=line.length()-1;i>=0;i--)
                // {
                //     reversedLine += line.charAt(i);
                // }
                // writer.write(reversedLine);   
                // writer.newLine();
            }
            reader.close();
            writer.close();
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }    
}
