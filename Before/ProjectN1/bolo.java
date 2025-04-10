package ProjectN1;

public class bolo {
    public static void main(String[] args) {
        Santa santa = new Santa("კლაუსი", "ბაბუა", 300, 10);
        Child child1 = new Child("ანა", 8, 3);
        Child child2 = new Child("გიორგი", 4, 3);
        Child child3 = new Child("სოფო", 6, 3);
        santa.addChild(child1);
        santa.addChild(child2);
        santa.addChild(child3);
        Child[] niceChildren = santa.checkNaughtyOrNiceList();
        System.out.println("კარგი ბავშვების სია:");
        for (Child child : niceChildren) {
            System.out.println(child.getName());
        }

        santa.deliverGifts();
        santa.spreadJoy();
        santa.singCarols();
        santa.decorateTree();
    }
}
