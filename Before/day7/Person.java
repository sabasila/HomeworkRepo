package day7;

public class Person
{
    private String accNumber;
    private String password;
    private double balance;
    private double deposit;

    public Person(String accNumber, String password, double Balance, double Deposit )
    {
        this.accNumber = accNumber;
        this.password = password;
        this.balance = Balance;
        this.deposit = Deposit;
    }

    public String getAccNumber()
    {
        return accNumber;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public void  deposit(double amouth, String password)
    {
        if(this.password.equals(password))
        {
            if(amouth > 0 && amouth <= 10000 )
            {
                balance+= amouth;
                System.out.println("შეტანილი თანხა " + amouth);
            } else
            {
                System.out.println("invalid amouth!");
            }
        } else {
            System.out.println("პასვორდი არასწორია!");
        }
    }
    public  void withdraw(double amouth, String  password)
    {
        if(this.password.equals(password))
        {
            if(amouth > 0 && balance >= amouth )
            {
                balance -= amouth;
                System.out.println("დარჩენილი თანხა " + balance);
            }
            else
            {
                System.out.println("invalid amouth!");
            }
        } else
        {
            System.out.println("პასვორდი არასწორია!");
        }
    }
    }
