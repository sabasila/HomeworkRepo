package Products;

public class Airplane extends Vehicle {
    private float wingspan;
    private int capacity;
    public boolean  landing_gear;

    public Airplane(String name, float wingspan, int capacity)
    {
        super(name);
        this.wingspan = wingspan;
        this.capacity = capacity;
        this.landing_gear = landing_gear;

    }

    private void landing_gear(boolean set)
    {
        this.landing_gear = set;
    }


    public float move(float distance) {
        return distance / (speed * 2);
    }


    public String describe() {
        return "";
    }
}