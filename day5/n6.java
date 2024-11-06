package day5;
import java.util.Scanner;
import java.util.Random;

public class n6
{
    public static void main(String[] args)
    {
        int[] b = {4, 6, 8, 9, 23, 54, 23};
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean found = false;
        for (int num :b )
        {
            if (num ==x )
            {
                found = true;
                break;
            }
        }
        if (found)
        {
            System.out.println("არის რიცხვი.");
        } else
        {
            System.out.println("არ არის.");
        }
    }
}




