package ru.tataev.geometry;

public class UpgradePoint3D extends UpgradedPoint2D{
    protected int z;

    @Override
    protected String pointToString() {
        return "{" + x + ", " + y + ", " + z + "}";
    }
}
