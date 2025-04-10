package ProjectN1;

public class Santa extends WorkshopMember implements ChristmasSpirit {
    private Child[] children;
    private int count;

    public Santa(String name, String nickname, int age, int maxChildren) {
        super(name, nickname, age);
        this.children = new Child[maxChildren];
        this.count = 0;
    }

    public void addChild(Child child) {
        if (count < children.length) {
            children[count++] = child;
        } else {
            System.out.println("ბავშვების სია სავსეა.");
        }
    }

    public void deliverGifts() {
        System.out.println("სანტა " + getNick() + " ანაწილებს საჩუქრებს.");
    }

    public Child[] checkNaughtyOrNiceList() {
        int niceCount = 0;
        for (int i = 0; i < count; i++) {
            if (children[i].getBehavior() > 5) {
                niceCount++;
            }
        }

        Child[] niceChildren = new Child[niceCount];
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (children[i].getBehavior() > 5) {
                niceChildren[index++] = children[i];
            }
        }

        return niceChildren;
    }

    @Override
    public void spreadJoy() {
        System.out.println("სანტა ავრცელებს სიხარულს.");
    }

    @Override
    public void singCarols() {
        System.out.println("სანტა მღერის საშობაო სიმღერებს.");
    }

    @Override
    public void decorateTree() {
        System.out.println("სანტა მორთავს ნაძვის ხეს.");
    }
}
