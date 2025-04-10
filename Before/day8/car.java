package day8;

class Car
{
    String brand;
    String model;
    int year;
    String licensi;

    public Car(String brand, String model, int year, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.licensi = licensePlate;
    }

    // Method to print car information
    public void printInfo() {
        System.out.println("მანქანა: " + brand + " " + model + ", " + year + " წელი, ნომერი: " + licensi);
    }
}


