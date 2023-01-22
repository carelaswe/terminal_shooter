package game.classes.weapons.ammo;

import game.intefaces.IAmmo;

public class PistolTwistedBullet implements IAmmo {
    @Override
    public int dealsDamage() {
        return (int) (7 + Math.random()*3);
    }
}
