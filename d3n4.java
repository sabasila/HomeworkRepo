import java.util.Scanner;

public class d3n4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
        System.out.println("usg " + a) ;

        }

    }
