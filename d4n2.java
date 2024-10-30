import java.util.Scanner;
public class d4n2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანეთ რიცხვი: ");
        int n = scanner.nextInt();
        while (n > 0)
        {
            int power = Integer.highestOneBit(n);
            System.out.print(power + " ");
            n -= power;
        }
    }
}
