package CheckUp;

import java.util.Random;
import java.util.Scanner;

public class davaleba19
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("რიგების რაოდენობა: ") ;
        int r = scanner.nextInt() ;
        int[][] arr = new int[r][r] ;
        for (int i = 0; i < r; i++ )
        {
            for(int j = 0; j < r; j++)
            {
                arr[i][j] = rand.nextInt(69);
            }
        }
        int sum = 0 ;
        for (int i = 0; i < r; i++)
        {
            sum += arr[i][i];
            sum += arr[i][r - 1 -i];
        }
        if (r % 2 != 0)
        {
            sum -= arr[r / 2][r / 2 ];
        }
        System.out.println(sum);
    }
}