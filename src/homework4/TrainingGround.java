package homework4;

import homework4.heroes.Hero;
import homework4.heroes.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        Hero hero = new Warrior("Vlad");
        Enemy enemy = new Enemy(100);
        hero.attackEnemy(enemy);
    }
}
