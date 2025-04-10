package Products;

public class Car extends MotorVehicle {
    private int num_doors ;
    public Car(String name, int num_doors) {
        super(name);
        this.num_doors = num_doors;
    }
    public String describe() {
        return "";
    }

    public String honk_horn() {
        return "";
    }
}