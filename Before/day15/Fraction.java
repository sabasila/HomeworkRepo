import java.util.Objects;

class Fraction {
    private int n; // numerator
    private int d; // denominator

    public Fraction(int n, int d) {
        if (d == 0) {
            throw new IllegalArgumentException("ვერ იქნება 0 მნიშვნელი");
        }
        this.n = n;
        this.d = d;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fraction fraction = (Fraction) obj;
        return n * fraction.d == d * fraction.n;
    }

    @Override
    public int hashCode() {
        return Objects.hash(n, d);
    }

    @Override
    public String toString() {
        return n + "/" + d;
    }
}
