public class AssaultRifle extends Gun{
    private final int fireRate;

    public AssaultRifle(int maxBullets, int fireRate) {
        super(maxBullets);
        if (fireRate <= 0){
            throw new IllegalArgumentException("Fire rate must be more than 0");
        }
        this.fireRate = fireRate;
    }

    public AssaultRifle(int maxBullets) {
        this(maxBullets, maxBullets/2);
    }

    public AssaultRifle() {
        this(30, 30);
    }

    public void shot(){
        this.shot(1);
    }

    public void shot(int secs){
        for (int i = 0; i < secs * fireRate; i++){
            super.shot();
        }
    }
}
