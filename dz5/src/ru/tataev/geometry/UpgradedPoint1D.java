package ru.tataev.geometry;

public class UpgradedPoint1D extends AbstractPoint{
    protected int x;

    @Override
    protected String pointToString() {
        return Integer.toString(x);
    }
}
