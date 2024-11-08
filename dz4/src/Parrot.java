import java.util.Random;

public class Parrot extends Bird {
    public Parrot(String text) {
        this.text = text;
        this.symbolCount = new Random().nextInt(text.length() - 1) + 2;
    }
}
