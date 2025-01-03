public class Fraction extends Number {
    private final int num;
    private final int den;

    public Fraction(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("Denomerator can't be 0");
        }
        if (den < 0) {
            this.num = -num;
            this.den = -den;
        } else {
            this.den = den;
            this.num = num;
        }
    }

    @Override
    public int intValue() {
        return num / den;
    }

    @Override
    public long longValue() {
        return intValue();
    }

    @Override
    public float floatValue() {
        return (float) num / (float) den;
    }

    @Override
    public double doubleValue() {
        return (double) num / (double) den;
    }

    public final Fraction sum(Fraction f2) {
        int resDen = this.den * f2.den;
        int resNum = this.num * f2.den + f2.num * this.den;
        return new Fraction(resNum, resDen);
    }

    public final Fraction minus(Fraction f2) {
        return sum(new Fraction(-f2.num, f2.den));
    }

    public final Fraction mult(Fraction f2) {
        int resDen = this.den * f2.den;
        int resNum = this.num * f2.num;
        return new Fraction(resNum, resDen);
    }

    public final Fraction div(Fraction f2) {
        return mult(new Fraction(f2.den, f2.num));
    }

    public String toString() {
        return num + "/" + den;
    }
}
