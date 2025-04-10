package day5;
import java.util.Scanner;
import java.util.Random;
public class n3
{
    public static void main(String[] args)
    {
        int[] b = new int[20];
        Random rand = new Random() ;
        for (int i = 0; i < b.length; i ++ )
        {
            b[i] = rand.nextInt(21) ;
        }
        int max = b[0] ;
        int min = b[0] ;
        for (int num : b)
        {
            if (num > max)
            {
                max =num ;
            }
            if (num < min)
            {
                min =num ;
            }
        }
        for (int num : b)
        {
            System.out.print(num + ",");
        }
        System.out.println("max:" + max + " min: " + min) ;
    }
    }




