package game.classes.units.warriors;

import game.intefaces.IWarrior;

public class Player implements IWarrior {
    int health = 100;
    @Override
    public void takingDamage(int damage) {
        health -=damage;
    }
    @Override
    public int heals () {
        int heals = (int) (10 + Math.random() * 10);
        health += (int) (10 + Math.random() * 10);
        return heals;
    }
    @Override
    public int getHealth() {
        return health;
    }
}
