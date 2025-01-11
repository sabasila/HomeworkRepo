import ProjectN1.Toy;

abstract class Toy1
{
    public abstract double getPrice();
}

class ToyCar extends Toy
{
    private double bodyPrice;
    private double wheelPrice;
    private int wheelCount;
    private double otherCost;

    public ToyCar(double bodyPrice, double wheelPrice, int wheelCount, double otherCost) {
        this.bodyPrice = bodyPrice;
        this.wheelPrice = wheelPrice;
        this.wheelCount = wheelCount;
        this.otherCost = otherCost;
    }
    @Override
    public double getPrice()
    {
        return bodyPrice + (wheelPrice * wheelCount) + otherCost;
    }
}

class ToyDoll extends Toy
{
    private double hairCost;
    private double dressCost;
    private double otherCost;

    public ToyDoll(double hairCost, double dressCost, double otherCost)
    {
        this.hairCost = hairCost;
        this.dressCost = dressCost;
        this.otherCost = otherCost;
    }

    @Override
    public double getPrice() {
        return hairCost + dressCost + otherCost;
    }
}

public class Main2 {
    public static void main(String[] args)
    {

    }
}
