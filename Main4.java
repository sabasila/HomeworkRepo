interface mdgomareoba
{
    void start();
    void stop();
}
interface wheel
{
    void left();
    void right();
}

class SimpleCar implements mdgomareoba, wheel
{
    @Override
    public void start() {
        System.out.println("start");
    }
    @Override
    public void stop()
    {
        System.out.println("stop");
    }

    @Override
    public void left()
    {
        System.out.println("left");
    }

    @Override
    public void right()
    {
        System.out.println("right");
    }
}

// Main Class
public class Main4 {
    public static void main(String[] args)
    {

    }
}
