package ProjectN1;

public class Child {
    private String name;
    private int behavior;
    private String[] wishList;
    private int wishCount;

    public Child(String name, int behavior, int maxWishes) {
        this.name = name;
        this.behavior = behavior;
        this.wishList = new String[maxWishes];
        this.wishCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getBehavior() {
        return behavior;
    }

    public String[] getWishList() {
        return wishList;
    }

    public void addWish(String wish) {
        if (wishCount < wishList.length) {
            wishList[wishCount++] = wish;
        } else {
            System.out.println("სურვილების სია სავსეა.");
        }
    }
}
