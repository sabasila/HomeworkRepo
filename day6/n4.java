package day6;
import java.util.Scanner;

public class n4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("მასივის ზომა: ") ;
        int n= scanner.nextInt() ;
        int[] array = new int[n] ;

        System.out.println("რიცხვები: ") ;
        for (int i = 0; i <n ; i ++ )
        {
            array[i] = scanner.nextInt();
        }

        System.out.println("რიცხვი რომელასც ვშლით: ") ;
        int washla = scanner.nextInt() ;

        int[] newarr = new int[n];

        int axali = 0;

        for (int i = 0; i <n; i ++)
        {
            if (array[i] != washla)
            {
                newarr[axali++] = array[i];
            }
        }

        System.out.print("ახალი მასივი: ") ;
        for (int i = 0; i < axali; i++)
        {
            System.out.print(newarr[i] + " ") ;
        }
        scanner.close();
    }
}



