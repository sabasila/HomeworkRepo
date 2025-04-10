package CheckUp;

import java.util.Scanner;
import java.util.Random;
public class davaleba18
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
            for(int j = 0; j < c; j++)
            {
                arr[i][j] = rand.nextInt(69);
            }
        }
        for (int i = 0; i < r; i++ )
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print(arr[i][j] + ", ") ;
            }
            System.out.println();
        }
        int min = arr[0][0];
        int max = arr[0][0];
        int minindexrow = 0;
        int maxindexrow = 0;
        int minindexcol = 0;
        int maxindexcol = 0;
        for (int i = 0; i < r; i++ )
        {
            for(int j = 0; j < c; j++)
            {
                if(arr[i][j] < min)
                {
                    min = arr[i][j];
                    minindexrow = i;
                    minindexcol = j;
                }
                if (arr[i][j] > max)
                {
                    max = arr[i][j];
                    maxindexrow = i;
                    maxindexcol = j;
                }
            }

        }
        System.out.println(min + "[" + minindexrow + "]" + "[" + minindexcol + "]" );
        System.out.println(max + "[" + maxindexrow + "]" + "[" + maxindexcol + "]" );


    }
}