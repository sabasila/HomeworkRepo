package day5;

public class n8 {
    public static void main(String[] args){
        int[] b = {3 ,4 ,5, 6, 7, 234, 34, 42 } ;
        int target = 8 ;
        for (int i = 0; i < b.length ; i ++)
        {
            for (int j = i +1; j< b.length ; j ++)
            {
                if (b[i]+b[j] ==target )
                {
                    System.out.println("ეს რიცხვებია: " +b[i] + "და" +b[j]);
                    return;
                }
            }
        }
        System.out.println("არ არის.");
    }
}






