class Animal {
    public int age;
    public String gender;

    public Animal(int age, String gender)

    {
        this.age = age;
        this.gender = gender;
    }
    public int getAge()
    {
        return age;
    }

    public String getGender ()
    {
        return gender;
    }

    public boolean isMammal ()
    {
        return false ;
    }

    public void mate()
    {
        System.out.println(".") ;
    }
}

class Duck extends  Animal
{
    public String beakColor;

    public Duck(int age, String gender, String beakColor)
    {
        super(age, gender);
        this.beakColor =beakColor;
    }

    public String getBeakColor()
    {
        return beakColor;
    }

    public void swim()
    {
        System.out.println("duck swim");
    }

    public void quack()
    {
        System.out.println("Duck quack");
    }
}

class Fish extends Animal
{
    private int sizeInFt;
    private boolean canEat;

    public Fish(int age, String gender, int sizeInFt, boolean canEat)
    {
        super(age, gender);
        this.sizeInFt = sizeInFt;
        this.canEat = canEat;
    }

    private void swim() {
        System.out.println("fish swim");
    }

    public int getSizeInFt() {
        return sizeInFt;
    }

    public boolean canEat() {
        return canEat;
    }
}

class Zebra extends Animal
{
    public boolean isWild;

    public Zebra(int age, String gender, boolean isWild)
    {
        super(age, gender);
        this.isWild = isWild;
    }

    public boolean isWild()
    {
        return isWild;
    }

    // Methods
    public void run() {
        System.out.println("zebra run");
    }
}
