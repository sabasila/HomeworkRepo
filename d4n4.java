import java.util.Scanner;

public class d4n4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("2 ან 10, 2 თუ ორობითიდან ათობითში, 10 თუ ათობითიდან ორობითში");
        int system = scanner.nextInt();
        if (system == 2)
        {
            System.out.print("შეიყვანეთ ორობითი: ");
            String str = scanner.next();
            int a = 0;
            int b = 1;
            for (int i = str.length() - 1; i >= 0; i--) {
                if (str.charAt(i) == '1') {
                    a += b;
                }
                b *= 2;
            }
            System.out.println( a);
        } else if (system == 10)
        {
            System.out.print("შეიყვანეთ ათობითი: ");
            int a = scanner.nextInt();
            String str = "";

            while (a > 0) {
                int c = a % 2;
                str = c + str;
                a /= 2;
            }
            System.out.println(str);

        } else
        {
            System.out.println(" 2 ან 10.");
        }
    }
}
