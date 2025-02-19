import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Human {
    private String name;
    private String surname;
    private int age;
    public Human(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public void walk() {
        System.out.println(name + " სეირნობს") ;
    }
    public void hangOut(Human other )
    {
        System.out.println(name +" is hanging out with " + other.name);
    }
    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }

    public int getAge()
    {
        return age;
    }
}
