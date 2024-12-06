package day8;

import java.util.Scanner;

public class jami {
    public static int jami(int a, int b, int k)
    {
        if (a > b) return 0; // Base case
        if (a % k == 0) {
            return a + jami(a + 1, b, k);
        } else {
            return jami(a + 1, b, k);
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ a:");
        int a =scanner.nextInt();
        System.out.println("შეიყვანეთ b:" );
        int b = scanner.nextInt() ;
        System.out.println("შეიყვანეთ k:" );
        int k = scanner.nextInt();
        int result = jami(a, b, k) ;
        System.out.println("ჯამი:" + result) ;
    }
}
