package day8;

public class Main
{
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Prius", 2015, "lasha123");
        Car car2 = new Car("Mercedes", "Amg63", 2022, "sasha123");
        car1.printInfo();
        car2.printInfo();
    }
}