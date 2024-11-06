package day4;

import java.util.Scanner;
public class d4n1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ") ;

        int n = scanner.nextInt();
        int sum = n * (n + 1)/2;
        double average =(double) sum /n;
        System.out.println(average);
    }
}