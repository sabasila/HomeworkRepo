package ProjectN1;

public class Reindeer extends WorkshopMember {
    private int speed;
    private String color;

    public Reindeer(String name, String nick, int age, int speed, String color) {
        super(name, nick, age);
        this.speed = speed;
        this.color = color;
    }

    public void fly() {
        System.out.println("ირემი " + getNick() + " მიფრინავს " + speed + " სიჩქარით.");
    }

    public void trainForChristmas() {
        System.out.println("ირემი " + getNick() + " ვარჯიშობს შობისთვის.");
        speed += 5;
    }

    public char checkFitnessLevel() {
        if (speed > 50 && getAge() < 10) return 'A';
        if (speed > 40) return 'B';
        if (speed > 30) return 'C';
        return 'F';
    }
}
