package day6;

public class n2
{
    public static void main(String[] args){
        int[] fasebi = {7, 1, 5, 3, 6, 4};
        int minPrice = Integer.MAX_VALUE;
        int max = 0;
        for (int fasi : fasebi)
        {
            if (fasi < minPrice)
            {
                minPrice = fasi;
            } else if (fasi - minPrice > max)
            {
                max = fasi - minPrice;
            }
        }
        System.out.println("მაქსიმალური მოგება: " + max);
    }
}





