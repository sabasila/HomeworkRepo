package CheckUp;

import java.util.Random;
import java.util.Scanner;

public class davaleba20
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("რიგების რაოდენობა: ") ;
        int r = scanner.nextInt() ;
        System.out.println("სვეტების რაოდენობა: ") ;
        int c = scanner.nextInt() ;
        int[][] arr = new int[r][c] ;
        for (int i = 0; i < r; i++ )
        {
            for(int j = 0; j < r; j++)
            {
                arr[i][j] = rand.nextInt(69);
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
        int [][] meorearr = new int[c][r];
        for (int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                meorearr[j][r - i - 1] = arr[i][j];
            }
        }
        for (int i = 0 ; i < c ; i++)
        {
            for(int j = 0; j < r; j++)
            {
                System.out.print(meorearr[i][j] + ", ");
            }
        }
    }
}