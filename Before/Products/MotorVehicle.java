package Products;

public class MotorVehicle extends Vehicle
{
    protected int number_of_wheels;
    protected float engine_volume;
    protected MotorVehicle(String name)
    {
        super(name);
    }
    public String honk_horn() 
    {
        return "";
    }
}
