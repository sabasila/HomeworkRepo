package ProjectN1;

public class Elf extends WorkshopMember implements ChristmasCelebrator {
    private int skill;
    private String type;

    public Elf(String name, String nick, int age, int skill, String type) {
        super(name, nick, age);
        this.skill = skill;
        this.type = type;
    }

    public void makeToy() {
        System.out.println("ელფი " + getNick() + " ქმნის სათამაშოს.");
        increaseExperience();
    }

    public void wrapGifts() {
        System.out.println("ელფი " + getNick() + " ფუთავს საჩუქრებს.");
        increaseExperience();
    }

    private void increaseExperience() {
        skill += 1;
    }

    @Override
    public void celebrateChristmas() {
        System.out.println("ელფი " + getNick() + " აღნიშნავს შობას.");
    }

    @Override
    public void hostChristmasParty() {
        System.out.println("ელფი " + getNick() + " აწყობს საშობაო წვეულებას.");
    }
}
