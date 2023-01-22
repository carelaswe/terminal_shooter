package game.classes.weapons;

import game.classes.weapons.ammo.PistolConventionalBullet;
import game.classes.weapons.ammo.PistolTracerBullet;
import game.classes.weapons.ammo.PistolTwistedBullet;
import game.intefaces.IAmmo;
import game.intefaces.IWeapon;

import java.util.ArrayList;
import java.util.List;

public class Pistol implements IWeapon {
    public Pistol() {
        rechargedMagazine();
    }
    List<IAmmo> magazine = new ArrayList<>();
    @Override
    public void rechargedMagazine() {
        magazine.clear();
        for (int i = 1; i <= 10; i++) {
            int typeAmmo = (int) (1 + Math.random() * 3);
            switch (typeAmmo) {
                case 1 -> magazine.add(new PistolConventionalBullet());
                case 2 -> magazine.add(new PistolTwistedBullet());
                case 3 -> magazine.add(new PistolTracerBullet());
            }
        }
    }
    @Override
    public int shoots() {
        if (magazine.isEmpty()) {
            rechargedMagazine();
            return 0;
        } else {
            int damage = magazine.get(0).dealsDamage();
            magazine.remove(0);
            return damage;
        }
    }
}