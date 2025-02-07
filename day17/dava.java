package day17;

import java.util.Scanner;

class NegativeNumberException extends Exception
{
    public NegativeNumberException(String message)
    {
        super(message);
    }
}
public class dava
{

    public static void checkNegativeNumber(int number) throws NegativeNumberException
    {
        if (number <0)
        {

            throw new NegativeNumberException("არ შეიძლება " + number);
        }


    }
    public static double calculateSquareRoot(int number ) throws  IllegalArgumentException
    {

        if (number<0 )
        {
            throw new IllegalArgumentException("ვერ გამოთვლი უარყოფითის ფესვს " +number) ;

        }

        return Math.sqrt(number);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.print("შეიყვანე რიცხვი ");
            int num1 = scanner.nextInt();
            System.out.print("შეიყვანეთ რიცხვი ");
            int num2 = scanner.nextInt();
            int result = num1 / num2;
            System.out.println("გამოვიდა: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ნულზე გაყოფა არ შეიძლება.");
        }

        try
        {
            System.out.print("შეიყვანე რიცხვი ");
            String input = scanner.next() ;
            int number = Integer.parseInt(input) ;
            int divisionResult = 100 / number ;
            System.out.println("100 გაყოფილი " + number + "-ზე არის " + divisionResult);
        }
        catch (NumberFormatException e)
        {
            System.out.println("შეცდომა: შეყვანილი მონაცემი არ არის რიცხვი.");
        } catch (ArithmeticException e)
        {

            System.out.println("ნულზე გაყოფა არ შეიძლება") ;
        }
        try {
            System.out.print("შეიყვანეთ რიცხვი შესამოწმებლად: ");
            int numToCheck = scanner.nextInt();
            checkNegativeNumber(numToCheck);
            System.out.println("რიცხვი ნებადართულია.");
        }
        catch (NegativeNumberException e)
        {
            System.out.println("შეცდომა: " + e.getMessage());
        }
        try
        {
            System.out.print("შეიყვანეთ რიცხვი კვადრატული ფესვის გამოსათვლელად: ");
            int numForSqrt = scanner.nextInt();
            double sqrtResult = calculateSquareRoot(numForSqrt);
            System.out.println("კვადრატული ფესვი: " + sqrtResult);
        } catch (IllegalArgumentException e) {
            System.out.println("შეცდომა: " + e.getMessage());
        }
        scanner.close();
    }
}
