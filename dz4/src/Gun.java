public class Gun {
    private int bullets;
    private final int maxBullets;

    public Gun(int maxBullets) {
        if (maxBullets < 0){
            throw new IllegalArgumentException("Maximum ammo can't be less than 0");
        }
        this.maxBullets = maxBullets;
    }

    public Gun() {
        this(5);
    }

    public int getMaxBullets() {
        return maxBullets;
    }

    public int getBullets() {
        return bullets;
    }

    public int reload(int ammo){
        if (ammo < 0){
            throw new IllegalArgumentException("Ammo can't be less than 0");
        }
        if (ammo + bullets > maxBullets){
            bullets = maxBullets;
            return maxBullets - ammo - bullets;
        }
        else {
            bullets += ammo;
            return 0;
        }
    }

    public int unload(){
        int curBullets;
        curBullets = bullets;
        bullets = 0;
        return curBullets;
    }

    public boolean isLoad(){
        return bullets > 0;
    }

    public void shot(){
        if (bullets > 0){
            System.out.println("Бах!");
            bullets--;
        }
        else{
            System.out.println("Клац!");
        }
    }
}
