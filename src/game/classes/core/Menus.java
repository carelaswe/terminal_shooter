package game.classes.core;

import java.util.Scanner;

public class Menus {
    static Scanner input = new Scanner(System.in);
    public static void getLogoGame() {
        System.out.print("""
                * * * * * * * * * * * * * * * * * * * * * *
                *              Battlefuu 2022             *
                * * * * * * * * * * * * * * * * * * * * * *""");
    }
    public static String getPreview() {
        String choice = null;
        boolean i = true ;
        while (i) {
            System.out.println();
            System.out.print("""
                *   Вы видите противника, ваши действия   *
                * * * * * * * * * * * * * * * * * * * * * *
                *  1 - Выстрелить                         *
                *  2 - Вылечиться                         *
                *  3 - Выйти из игры                      *
                * * * * * * * * * * * * * * * * * * * * * * :\040""");
            choice = input.nextLine();
            switch (choice) {
                case "1", "2", "3" -> i = false;
                default -> getFailedChoice();
            }
        }
        return choice;
    }
    public static void getFailedChoice() {
        System.out.print("""
                *       Внимательнее будьте, ещё раз :    *
                * * * * * * * * * * * * * * * * * * * * * *""");
    }
    public static void getExitGame() {
        System.out.print("""
                *                Прощайте!                *
                * * * * * * * * * * * * * * * * * * * * * *""");
    }
    public static void getInfoDamage(int getDamageUnit, int getDamagePlayer) {
        System.out.printf("""
                *   Вы нанесли %d урона!                  *
                *   Противник нанес %d урона!             *
                * * * * * * * * * * * * * * * * * * * * * *""", getDamageUnit, getDamagePlayer);
    }
    public static void getInfoHeals(int healsPlayer, int getDamagePlayer) {
        System.out.printf("""
                *   Вы востановили %d жизни!              *
                *   Противник нанес %d урона!             *
                * * * * * * * * * * * * * * * * * * * * * *""", healsPlayer, getDamagePlayer);
    }
    public static void getInfoHealth (int playerHealth, int unitHealth) {
        System.out.println();
        System.out.printf("""
                *   У вас осталось %d здоровья              *
                *   У противника осталось %d здоровья       *
                * * * * * * * * * * * * * * * * * * * * * * *""", playerHealth, unitHealth);
    }
    public static void getVictory() {
        System.out.println();
        System.out.print("""
                *              ВЫ ПОБЕДИЛИ!               *
                * * * * * * * * * * * * * * * * * * * * * *
                """);
    }
    public static void getSuckCock() {
        System.out.println();
        System.out.print("""
                *          Опущенный, проебал!            *
                * * * * * * * * * * * * * * * * * * * * * *
                """);
    }
}