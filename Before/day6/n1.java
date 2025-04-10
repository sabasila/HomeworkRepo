package day6;
import java.util.Scanner;

public class n1
{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int[] arr = {43, 435, 1 ,4 };
    while (true)
    {
        boolean nuli = true;
        for (int num : arr)
        {
            if (num !=0)
            {
                nuli = false ;
                break ;
            }
        }
        if (nuli)
        {
            System.out.println("yvela nulia:");
            break;
        }
        int input = scanner.nextInt();
        for (int i = 0; i < arr.length ; i ++ )
        {
            if (arr[i] == input)
            {
                arr[i] = 0 ;
            }
        }
    }
    scanner.close();
}
}





