package day5;
public class n1
{
    public static void main(String[] args)
    {
        int[] b = new int[12];
        for (int i = 0; i < b.length ; i ++)
        {
            b[i] =(int)(Math.random() * 100) ;
        }
        for (int num : b)
        {
            System.out.print(num + ",");
        }
    }
}






