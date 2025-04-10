package day5;
import java.util.Scanner;
import java.util.Random;

public class n7 {
    public static void main(String[] args)
    {
        String[] b = {"irakli", "leqso" , "jaba","nugzari"} ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("shemoitane saxeli: ");
        String str = scanner.nextLine();
        String[] newarr = new String[b.length + 1];
        newarr[0] = str;
        for (int i = 0; i < b.length; i++)
        {
            newarr[i + 1] = b[i];
        }

        for (String element : newarr)
        {
            System.out.print(element + ", ");
        }
        System.out.println();

    }
}






