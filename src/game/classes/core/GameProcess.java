package game.classes.core;

import game.classes.units.warriors.Player;
import game.classes.units.warriors.Unit;
import game.classes.weapons.Pistol;
import game.intefaces.IWarrior;
import game.intefaces.IWeapon;
import static game.classes.core.Menus.*;

public class GameProcess {
    public void startGame() {
        IWarrior player = new Player();
        IWarrior unit = new Unit();
        IWeapon pistolPlayer = new Pistol();
        IWeapon pistolUnit = new Pistol();
        boolean i = true;
        int getDamageUnit;
        int getDamagePlayer;
        int heals;
        getLogoGame();
        while (i) {
            String choice = getPreview();
            switch (choice) {
                case "1" -> {
                    getDamageUnit = pistolPlayer.shoots();
                    unit.takingDamage(getDamageUnit);
                    getDamagePlayer = pistolUnit.shoots();
                    player.takingDamage(getDamagePlayer);
                    getInfoDamage(getDamageUnit, getDamagePlayer);
                    getInfoHealth(player.getHealth(), unit.getHealth());
                }
                case "2" -> {
                    heals = player.heals();
                    getDamagePlayer = pistolUnit.shoots();
                    player.takingDamage(getDamagePlayer);
                    getInfoHeals(heals, getDamagePlayer);
                    getInfoHealth(player.getHealth(), unit.getHealth());
                }
                case "3" -> {i = false;  getExitGame();}
            }
            if (player.getHealth() <= 0) {
                getSuckCock();
                getExitGame();
                i = false;
            } else if (unit.getHealth() <= 0) {
                getVictory();
                getExitGame();
                i = false;
            }
        }
    }
}
