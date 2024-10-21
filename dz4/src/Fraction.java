public class Fraction {
    private final int num;
    private final int den;

    public Fraction(int num, int den) {
        this.num = num;
        if (den == 0){
            throw new IllegalArgumentException("Denomerator can't be 0");
        }
        this.den = den;
    }

    public Fraction sum(Fraction f2){
        int resDen = this.den * f2.den;
        int resNum = this.num * f2.den + f2.num * this.den;
        return new Fraction(resNum, resDen);
    }

    public Fraction minus(Fraction f2){
        return sum(new Fraction(-f2.num, f2.den));
    }

    public Fraction mult(Fraction f2){
        int resDen = this.den * f2.den;
        int resNum = this.num * f2.num;
        return new Fraction(resNum, resDen);
    }

    public Fraction div(Fraction f2){
        return mult(new Fraction(f2.den, f2.num));
    }

    public String toString(){
        return num + "/" + den;
    }
}
