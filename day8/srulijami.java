package day8;

import java.util.Scanner;

public class srulijami {
    public static int sumn(int n) {
        if (n == 1)
            return 1;
        return n + sumn(n - 1);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("შეიყვანეთ n: ");
        int n = scanner.nextInt();
        int result = sumn(n);
        System.out.println( result);
    }
}
