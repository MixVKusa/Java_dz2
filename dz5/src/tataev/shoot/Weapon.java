package ru.tataev.shoot;

public abstract class Weapon {
    protected int ammo;

    public Weapon(int ammo) {
        if (ammo < 0) throw new IllegalArgumentException("Ammo can't be less than 0");
        this.ammo = ammo;
    }
    abstract void shot();
    public int ammo(){
        return ammo;
    }
    public boolean getAmmo(){
        if (ammo == 0) return false;
        ammo--;
        return true;
    }
    public int load(int ammo){
        if (ammo < 0) throw new IllegalArgumentException("Ammo can't be less than 0");
        int tmp = ammo;
        this.ammo = ammo;
        return tmp;
    }
}
