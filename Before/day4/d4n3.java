package day4;

public class d4n3 {
    public static void main(String[] args)
    {
        for (int i = 1; i <= 15; i +=2)
        {
            if (i ==5 || i== 7 || i ==11)
                continue;
            System.out.println(i);
        }
    }
}
