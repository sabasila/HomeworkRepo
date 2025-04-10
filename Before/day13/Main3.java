abstract class Worker
{
    protected String firstName;
    protected String lastName;
    protected String phone;
    public Worker(String firstName, String lastName, String phone)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public abstract double getSalary();
}

class FixedWorker extends Worker
{
    private double salary;

    public FixedWorker(String firstName, String lastName, String phone, double salary)
    {
        super(firstName, lastName, phone);
        this.salary = salary;
    }

    @Override
    public double getSalary()
    {
        return salary;
    }
}

class HourlyWorker extends Worker
{
    private int days;
    private double dailyRate;

    public HourlyWorker(String firstName, String lastName, String phone, int days, double dailyRate)
    {
        super(firstName, lastName, phone);
        this.days = days;
        this.dailyRate = dailyRate;
    }

    @Override
    public double getSalary()
    {
        return days * dailyRate;
    }
}

public class Main3
{
    public static void main(String[] args)
    {

    }
}
