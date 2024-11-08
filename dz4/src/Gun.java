public class Gun extends Weapon{
    private final int maxBullets;

    public Gun(int maxBullets, int bullets) {
        super(bullets);
        if (maxBullets < 0){
            throw new IllegalArgumentException("Maximum ammo can't be less than 0");
        }
        if (bullets > maxBullets) this.ammo = maxBullets;
        this.maxBullets = maxBullets;
    }

    public Gun(int maxBullets) {
        this(maxBullets, 5);
    }

    public int getMaxBullets() {
        return maxBullets;
    }

    public int reload(int ammo){
        if (ammo < 0){
            throw new IllegalArgumentException("Ammo can't be less than 0");
        }
        if (ammo + this.ammo > maxBullets){
            this.ammo = maxBullets;
            return maxBullets - ammo - this.ammo;
        }
        else {
            this.ammo += ammo;
            return 0;
        }
    }

    public int unload(){
        int curBullets;
        curBullets = ammo;
        ammo = 0;
        return curBullets;
    }

    public boolean isLoad(){
        return ammo > 0;
    }

    public void shot(){
        if (ammo > 0){
            System.out.println("Бах!");
            ammo--;
        }
        else{
            System.out.println("Клац!");
        }
    }
}
