package ProjectN1;

public abstract class WorkshopMember {
    private String name;
    private String nick;
    private int age;

    public WorkshopMember(String name, String nick, int age) {
        this.name = name;
        this.nick = nick;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getNick() {
        return nick;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
