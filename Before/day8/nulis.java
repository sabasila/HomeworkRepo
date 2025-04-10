package day8;

import java.util.Scanner;
public class nulis {
    public static int nulis(int num) {
        if (num== 0)
            return 1;
        if (num < 10 )
            return 0;
        if (num % 10 ==0)
        {
            return 1 + nulis(num / 10);
        } else {
            return nulis(num / 10);
        }
    }

    public static void shemowmeba(int num) {
        int c = nulis(num);
        if (c % 2 == 0)
        {
            System.out.println("ლუწია");
        } else {
            System.out.println("კენტია.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ რიცხვი:");
        int num = scanner.nextInt();

        shemowmeba(num);
    }
}
