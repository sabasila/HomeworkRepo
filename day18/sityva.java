package day18;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class sityva
{
    public static void main(String[] args) {
        String fileName = "day18/saba.txt";
        File file = new File(fileName);
        int wordCount = 0;
        try (Scanner scanner = new Scanner(file))
        {
            while (scanner.hasNext())
            {
                scanner.next();
                wordCount++;
            }
            System.out.println("სიტყვები " + wordCount);
        } catch (IOException e)
        {
            System.out.println("ფაილის წაკითხვის შეცდომა: " + e.getMessage());
        }
    }
}
