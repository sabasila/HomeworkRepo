package day18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class search {
    public static void main(String[] args)
    {
        String fileName = "day18/saba.txt";
        Scanner input = new Scanner(System.in);
        String searchWord = input.nextLine();
        boolean found = false;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                if (line.contains(searchWord))
                {
                    found = true;
                    break;
                }
            }
            if (found )
            {
                System.out.println("არის");
            }
            else
            {
                System.out.println("არ არის");
            }
        } catch (IOException e)
        {
            System.out.println("ფაილის წაკითხვის შეცდომა: " + e.getMessage());
        }
    }
}
