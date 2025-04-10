package day5;
import java.util.Scanner;
import java.util.Random;
public class n9
{
    public static void main(String[] args)
    {
        int[] b = {23, 45, 563, 54, 69, 453 } ;
        Scanner scanner = new Scanner(System.in);
        for (int num : b)
        {
            System.out.print(num + ", ");
        }
        int x = scanner.nextInt();
        int c = 0 ;
        for (int num :b )
        {
            if(num !=x )
            {
                c++ ;
            }
        }
        int[] newarr = new int[c];
        int index = 0 ;

        for (int num : b)
        {
            if (num != x)
            {
                newarr[index++] = num;
            }
        }
        for (int num : newarr)
        {
            System.out.print(num + ",");
        }
        System.out.println();
    }
}






