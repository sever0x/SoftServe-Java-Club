package homework4.heroes;

import homework4.enemies.Enemy;

import java.util.Random;

public class Mage extends Hero {
    private final int damage = 15;

    private final double damageMultiplierFireBall = 1.3;

    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Mage attacked the enemy");
        if (fireBall()) {
            System.out.println("\nTHE MAG HAS APPLIED A FIREBALL SPELL. DAMAGE INCREASED!!!\n");
            enemy.takeDamage((int) (damage * damageMultiplierFireBall));
        } else {
            enemy.takeDamage(damage);
        }
    }

    private boolean fireBall() {
        return new Random().nextBoolean();
    }
}
