package CheckUp;

public class davaleba17
{
    public static void main(String[] args)
    {
       for (int i = 0; i <= 100; i++)
       {
           if (i % 5 == 0 && i % 7 == 0)
           {
               System.out.println("HEYHOW");
           }
           else if (i % 5 == 0)
           {
               System.out.println("HEY");
           }
           else if (i % 7 == 0)
           {
               System.out.println("HOW");
           }
           else {
               System.out.println(i);
           }
       }
    }
}