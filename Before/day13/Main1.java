class Figurea
{
    protected double width;
    protected double height;
    public Figurea(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    public String getName()
    {
        return "figura";
    }
    public double getPerimeter()
    {
        return 0;
    }

    public void printInfo()
    {
        System.out.println(getName() +  width + " . " + height);
    }
}
class SimpleTriangle extends Figurea
{
    private double side3;

    public SimpleTriangle(double width, double height, double side3)
    {
        super(width, height);
        this.side3 = side3;
    }

    @Override
    public String getName()
    {
        return "samkutxedi";
    }

    @Override
    public double getPerimeter() {
        return width + height + side3;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("perimetri: " + getPerimeter());
    }
}

// Rectangle Class
class SimpleRectangle extends Figurea {
    public SimpleRectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Perimeter: " + getPerimeter());
    }
}

// Main Class
public class Main1 {
    public static void main(String[] args) {

    }
}
