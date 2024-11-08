import java.util.Random;

public class Gowk extends Bird {
    public Gowk() {
        this.text = "ку-ку";
    }

    @Override
    public void sing() {
        int singCount = new Random().nextInt(10) + 1;
        for (int i = 0; i < singCount; i++) {
            super.sing();
        }
    }
}
