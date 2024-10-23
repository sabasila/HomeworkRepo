
public class d3n6
{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 1;
        System.out.println("fibonachi");
        System.out.print(a+" "+b + " ");

        for (int i = 2; i < 10; i++)
        {
            int fib = a + b;
            System.out.print(fib + " ");
            a = b;
            b = fib;
        }
    }
}