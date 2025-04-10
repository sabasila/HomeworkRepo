package day2;

import java.util.Scanner;

public class d2n1 {
    public static void main(String[] args) {
        //1
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("შეიყვანეთ ცელსიუსი: ");
//        double cels = scanner.nextDouble();
//        double fare = (cels * 9 / 5) + 32;
//        System.out.println("ფარენგეიტში: " + fare);
        //2
//        Scanner scanner = new Scanner(System.in) ;
//        System.out.print ("შეიყვანეთ ცელსიუსი :") ;
//        double fare = scanner.nextDouble();
//        double cels = (fare - 32) * 5 / 9 ;
//        System.out.println("ცელსიუსში: "+ cels) ;
        //3
//        Scanner scanner = new Scanner(System.in) ;
//        System.out.print("წელი: ") ;
//        int weli = scanner.nextInt() ;
//        if ((weli % 4== 0  && weli % 100!= 0) || weli % 400 == 0)
//        {
//            System.out.println(weli + "ნაკიანია");
//        } else {
//            System.out.println(weli + "არაა");
//        }
        //4
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("X: ") ;
//        int x = scanner.nextInt() ;
//
//        System.out.print("Y: ") ;
//        int y = scanner.nextInt() ;
//
//        if (x> 0 && y> 0)
//        {
//            System.out.println("       *      ");
//            System.out.println("       *    .  ");
//            System.out.println("       *      ");
//            System.out.println("**************");
//            System.out.println("       *      ");
//            System.out.println("       *      ");
//            System.out.println("       *      ");
//        } else
//            if (x <0 && y >0)
//            {
//                System.out.println("       *      ");
//                System.out.println("       *      ");
//                System.out.println("  .    *      ");
//                System.out.println("**************");
//                System.out.println("       *      ");
//                System.out.println("       *      ");
//                System.out.println("       *      ");
//        } else
//            if (x <0 && y <0)
//            {
//                System.out.println("       *      ");
//                System.out.println("       *      ");
//                System.out.println("       *      ");
//                System.out.println("**************");
//                System.out.println("       *      ");
//                System.out.println(" .     *      ");
//                System.out.println("       *      ");
//        } else
//            if (x >0 && y <0)
//            {
//                System.out.println("       *      ");
//                System.out.println("       *      ");
//                System.out.println("       *      ");
//                System.out.println("**************");
//                System.out.println("       *      ");
//                System.out.println("       *      ");
//                System.out.println("       *   .   ");
//        } else
//            if (x ==0 && y ==0)
//            {
//                System.out.println("       *      ");
//                System.out.println("       *      ");
//                System.out.println("       *      ");
//                System.out.println("*******.******");
//                System.out.println("       *      ");
//                System.out.println("       *      ");
//                System.out.println("       *      ");
//        } else
//            if (x== 0)
//            {
//                System.out.println("       *      ");
//                System.out.println("       .      ");
//                System.out.println("       *      ");
//                System.out.println("**************");
//                System.out.println("       *      ");
//                System.out.println("       *      ");
//                System.out.println("       *      ");
//        } else
//            if (y ==0)
//            {
//                System.out.println("       *      ");
//                System.out.println("       *      ");
//                System.out.println("       *      ");
//                System.out.println("***********.**");
//                System.out.println("       *      ");
//                System.out.println("       *      ");
//                System.out.println("       *      ");
//        }
        //5
        Scanner scanner = new Scanner(System.in);
        System.out.print("Shemoitane simbolo ");
        char matematika = scanner.next().charAt(0);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        double c = 0;
        if (matematika =='+')
        {
            c = a +b;
        } else if (matematika== '-')
        {
            c = a -b ;
        } else
            if (matematika== '*')
        {
            c = a *b ;
        } else
            if (matematika == '/')
        {
                c = a /b;
        }
         else
         {
            System.out.println("sxva rame shoitane.");
            return;
        }
        System.out.println("პასუხი:"+ c);
    }
}
