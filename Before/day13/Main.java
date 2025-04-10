class Shape
{
    protected int sides;
    protected double size;

    public Shape(int sides, double size) {
        this.sides = sides;
        this.size = size;
    }

    public double getPerimeter() {
        return sides * size;
    }
}

// Square Class
class Box extends Shape {
    public Box(double size) {
        super(4, size);
    }

    @Override
    public double getPerimeter() {
        return 4 * size;
    }
}

class Trianglea extends Shape
{
    public Trianglea(double size)
    {
        super(3, size);
    }

    @Override
    public double getPerimeter()
    {
        return 3 * size;
    }
}

// Main Class
public class Main {
    public static void main(String[] args)
    {

    }
}
