package day5;

public class n5 {
    public static void main(String[] args)
    {
        int[] b = {53, 42, 57, 14, 90};
        int sum = 0 ;
        int a = 1;
        for (int num :b )
        {
            sum += num ;
            a *= num ;
        }
        double average = (double) sum / b.length;
        System.out.println("ჯამი"+ sum);
        System.out.println("ნამრავლი" + a);
        System.out.println("საშუალო არითმეტიკული" + average);
    }
}




