package Products;

public class Truck extends MotorVehicle
{
    private float horsepower;

    public Truck(String name, float horsepower) {
        super(name);
        this.horsepower = horsepower;
    }


    public String describe() {
        return ".";
    }


    public String honk_horn() {
        return "!";
    }
}
