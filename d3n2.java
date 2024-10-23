import java.util.Scanner;
public class d3n2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sjeitane:");
        int num = scanner.nextInt();
        int a = 0;
        while (num  > 0) {
            num /= 10;
            a++;
        }
        System.out.println(a);
    }
}