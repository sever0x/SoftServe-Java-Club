package homework4.heroes;

import homework4.enemies.Enemy;

import java.util.Random;

public class Archer extends Hero {
    private final int damage = 30;

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer attacked the enemy");
        if (miss()) {
            System.out.println("\nOH NO!!! THE ARCHER MISSED THE ENEMY\n");
        } else {
            enemy.takeDamage(damage);
        }
    }

    private boolean miss() {
        return new Random().nextBoolean();
    }
}
