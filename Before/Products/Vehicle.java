package Products;

public class Vehicle
{
    private String name;
    protected float speed;

    protected Vehicle(String name)
    {
        this.name =name;

        this.speed = 0 ;
    }

    public float move(float distance)
    {

        return distance / speed;
    }

    public String getName()
    {

        return name;
    }

    public String describe()
    {
        return  name + speed ;
    }
}


