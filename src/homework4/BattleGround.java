package homework4;

import homework4.enemies.Enemy;
import homework4.enemies.Rogue;
import homework4.heroes.Archer;
import homework4.heroes.Hero;
import homework4.heroes.Mage;
import homework4.heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Hero war = new Archer("Vlad");
        Enemy enemy = new Rogue(100);

        while (true) {
            if (war.isAlive()) {
                war.attackEnemy(enemy);
            } else {
                System.out.println("Hero is dead");
                break;
            }
            if (enemy.isAlive()) {
                enemy.attackHero(war);
            } else {
                System.out.println("Enemy is dead");
                break;
            }
        }
    }
}
