import java.util.Random;

public class Gowk extends Bird {
    int singCount = new Random().nextInt(10) + 1;

    public Gowk() {
        this.text = "ку-ку";
    }

    @Override
    public void sing() {
        for (int i = 0; i < singCount; i++) {
            super.sing();
        }
    }
}
