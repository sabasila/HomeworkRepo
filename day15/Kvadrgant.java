import java.util.Objects;

class







    

Kvadrgant {
    private double a;
    private double b;
    private double c;
    private Double x1;
    private Double x2;

    public Kvadrgant(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("Coefficient 'a' cannot be zero.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        calculateRoots();
    }

    private void calculateRoots() {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            x1 = x2 = null;
        } else if (discriminant == 0) {
            x1 = x2 = -b / (2 * a);
        } else {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Kvadrgant that = (Kvadrgant) obj;
        return Objects.equals(x1, that.x1) && Objects.equals(x2, that.x2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, x2);
    }

    @Override
    public String toString() {
        return "Kvadrgant{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", x1=" + x1 +
                ", x2=" + x2 +
                '}';
    }
}

