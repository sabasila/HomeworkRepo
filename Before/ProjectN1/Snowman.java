package ProjectN1;

import java.util.ArrayList;
import java.util.List;

public class Snowman {
    private double height;
    private String hat;
    private boolean magical;
    private List<String> accessories;

    public Snowman(double height, String hat) {
        this.height = height;
        this.hat = hat;
        this.magical = false;
        this.accessories = new ArrayList<>();
    }

    public void decorate(String acc) {
        accessories.add(acc);
        System.out.println("თოვლის ბაბუას დაემატა აქსესუარი: " + acc);
    }

    public void melt() {
        if (height == 0) return;
        height = Math.max(0, height / 2);
        System.out.println("თოვლის ბაბუა დნება, სიმაღლე: " + height);
    }

    public void makeMagical() {
        magical = true;
        System.out.println("თოვლის ბაბუა გახდა ჯადოსნური.");
    }
}
