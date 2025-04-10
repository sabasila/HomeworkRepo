package day14;

class PC
{
    private String country;
    private String brand;
    private int price;
    private boolean warranty;

    public PC(String country, String brand, int price, boolean warranty)
    {
        this.country = country;
        this.brand = brand;
        this.price = price;
        this.warranty = warranty;
    }

    class Monitor
    {
        private int size;
        private String res;
        private int hz;

        public Monitor(int size, String res, int hz) {
            this.size = size;
            this.res = res;
            this.hz = hz;
        }

        public void printInfo()
        {
            System.out.println("მწარმოებელი ქვეყანა: " + country);
            System.out.println("ფირმა: " + brand);
            System.out.println("ფასი: " + price + " ლარი");
            System.out.println("გარანტია: " + (warranty ? "დიახ" : "არა"));
            System.out.println("მონიტორის ზომა: " + size + " დუიმი");
            System.out.println("რეზოლუცია: " + res);
            System.out.println("სიხშირე: " + hz + " Hz");
        }
    }
}

