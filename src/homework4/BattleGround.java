package homework4;

import homework4.heroes.Hero;
import homework4.heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Hero war = new Warrior("Vlad");
        Enemy enemy = new Enemy(100);

        while (enemy.isAlive()) {
            war.attackEnemy(enemy);
        }
    }
}
