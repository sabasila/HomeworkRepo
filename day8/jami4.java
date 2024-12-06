package day8;

import java.util.Scanner;

public class jami4
{
    public static int xar(int a, int n)
    {
        if (n ==  0)
            return 1 ;
        return a * xar(a, n - 1);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ a:");
        int a = scanner.nextInt();

        System.out.println("შეიყვანეთ n: ");
        int n = scanner.nextInt() ;
        int result = xar(a, n);
        System.out.println(result);
    }
}
