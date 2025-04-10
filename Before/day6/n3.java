package day6;
import java.util.Scanner;

public class n3 {
    public static void main(String[] args)
    {
            Scanner scanner = new Scanner(System.in);

            System.out.println("მასივის ზომა: ") ;
            int n = scanner.nextInt() ;
            int[] array = new int [n];

            System.out.println("რიცხვები:") ;
            for (int i = 0; i < n; i++)
            {
                array [i] = scanner.nextInt() ;
            }
            boolean pal =true ;
            for (int i = 0; i < array.length /2; i++ )
            {
                if (array[i] != array[array.length -1 - i] )
                {
                    pal = false ;

                    break;
                }
            }
        if (pal)
        {
            System.out.println("არის ");
        }
        else
        {
            System.out.println("არრაა") ;
        }

        scanner.close();
    }
}





