package ru.tataev.calculating;

public class FractionBuilder {
    private static int count = 0;

    public FractionBuilder() {
        if (count > 0) throw new RuntimeException();
        count++;
    }

    public Fraction createFraction(int num, int den){
        return new Fraction(num, den);
    }
}
