package day18;

import java.io.*;
public class orifaili
{
    public static void main(String[] args) {
        String file1= "day18/read.txt";
        String file2  = "day18/output.txt";
        String mergedFile= "day18/ertad.txt";
        try (PrintWriter writer = new PrintWriter(mergedFile);
             BufferedReader br1 = new BufferedReader(new FileReader(file1));
             BufferedReader br2= new BufferedReader(new  FileReader(file2)))
        {
            writer.println("პირველი ფაილი:");
            String line;
            while ((line = br1.readLine()) != null)
            {
                writer.println(line ) ;
            }
            writer.println("\nმეორე ფაილი:" ) ;
            while ((line = br2.readLine())!= null)
            {

                writer.println(line);
            }
            System.out.println("გაერთიანდა!");
        } catch (IOException e)
        {
            System.out.println("შეცდომა: " + e.getMessage());
        }
    }
}
