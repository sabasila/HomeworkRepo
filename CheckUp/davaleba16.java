package CheckUp;

public class davaleba16
{
    public static void main(String[] args)
    {
        int[] prices = {1, 3, 6, 7, 2, 8};
        int minfasi = prices[0];
        int minindex = 0;
        int maxfasi = prices[0];
        int maxindex = 0;
        for (int i = 1 ; i < prices.length; i++)
        {
            if (prices[i] < minfasi)
            {
                minfasi = prices[i];
                minindex = i;
            }
            if (prices[i] > maxfasi)
            {
                maxfasi = prices[i];
                maxindex = i;
            }
        }
        System.out.println(minindex + "მაღაზიაში ყველაზე ნაკლებ ფასიანია და ღირს:" + minfasi );
        System.out.println(maxindex + "მაღაზიაში ყველაზე მეტ ფასიანია და ღირს:" + maxfasi );
    }
}