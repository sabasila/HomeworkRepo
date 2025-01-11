package day14;

class Car
{
    private String brand;
    private String model;
    private String plate;

    public Car(String brand, String model, String plate) {
        this.brand = brand;
        this.model = model;
        this.plate = plate;
    }

    class Engine
    {
        private String fuel;
        private int cyls;
        private int res;

        public Engine(String fuel, int cyls, int res)
        {
            this.fuel = fuel;
            this.cyls = cyls;
            this.res = res;
        }

        public void printInfo() {
            System.out.println("ავტომობილის მწარმოებელი: " + brand);
            System.out.println("მოდელი: " + model);
            System.out.println("საწვავის ტიპი: " + fuel);
            System.out.println("ცილინდრები: " + cyls);
            System.out.println("რესურსი: " + res + " კმ");
        }
    }
}

