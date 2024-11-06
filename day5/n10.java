package day5;
import java.util.Scanner;

public class n10 {
    public static void main(String[] args) {
        int[] b = {3, 5, 7, 9};
        Scanner scanner = new Scanner(System.in);
        while (true )
        {
            boolean nuli = true;
            for (int num :b)
            {
                if ( num!= 0 )
                {
                    nuli = false ;
                    break;
                }
            }
            if  (nuli)
                break ;
            for (int num :b) {
                System.out.print (num + ",") ;
            }
            System.out.print("შეიყვანეთ რა რიცხვი გავანულოთ ") ;

            int x = scanner.nextInt();
            for (int i = 0; i < b.length; i++)
            {
                if (b[i] ==x )
                {
                    b[i] = 0;
                }
            }
        }
        System.out.println("განულებულია!");
    }
}





