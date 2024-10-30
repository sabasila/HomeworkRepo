import java.util.Random;
import java.util.Scanner;
public class d4n6
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int b = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        while (a!= b)
        {
            System.out.print("shemoitane ricxvi: ");
            a = scanner.nextInt();
            if (a < b)
            {
                System.out.println("naklebia:");
            }
            else
                if (a >b)
            {
                System.out.println("metia:");
            } else
            {
                System.out.println("sworia");
            }
        }
    }
}
