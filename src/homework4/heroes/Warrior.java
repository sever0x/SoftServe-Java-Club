package homework4.heroes;

import homework4.Enemy;

public class Warrior extends Hero {
    private int damage = 20;

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Warrior attacked the enemy");
        enemy.takeDamage(damage);
    }
}
