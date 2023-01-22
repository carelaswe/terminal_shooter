package game.classes.weapons.ammo;

import game.intefaces.IAmmo;

public class PistolConventionalBullet implements IAmmo {
    @Override
    public int dealsDamage() {
        return (int) (5 + Math.random()*3);
    }
}
