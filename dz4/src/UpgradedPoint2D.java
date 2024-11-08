public class UpgradedPoint2D extends UpgradedPoint1D{
    protected int y;

    @Override
    protected String pointToString() {
        return "{" + x + ", " + y + "}";
    }
}
