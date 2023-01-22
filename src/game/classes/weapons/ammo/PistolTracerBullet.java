package game.classes.weapons.ammo;

import game.intefaces.IAmmo;
public class PistolTracerBullet implements IAmmo {

    @Override
    public int dealsDamage() {
        return (int) (9 + Math.random()*3);
    }
}
