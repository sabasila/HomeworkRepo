package ProjectN1;

public class Toy {
    private String type;
    private int difficulty;

    public Toy(String type, int difficulty) {
        this.type = type;
        this.difficulty = difficulty;
    }

    public boolean isChallenging() {
        return difficulty > 7;
    }

    @Override
    public String toString() {
        return "სათამაშო ტიპი: " + type + ", სირთულე: " + difficulty;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Toy toy = (Toy) obj;
        return difficulty == toy.difficulty && type.equals(toy.type);
    }

    @Override
    public int hashCode() {
        return type.hashCode() * 31 + difficulty;
    }
}
