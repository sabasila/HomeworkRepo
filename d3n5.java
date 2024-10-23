public class d3n5 {
    public static void main(String[] args) {
        for (int x = 100; x <= 999; x++)
        {
            int as = x / 100;
            int at = (x / 10) %10;
            int c = x % 10;
            int jami = as + at + c;
            if (x % jami == 0) {
                System.out.println(x);
            }
        }
    }
}