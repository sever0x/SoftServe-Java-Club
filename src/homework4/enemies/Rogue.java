package homework4.enemies;

import homework4.heroes.Hero;

import java.util.Random;

public class Rogue extends Enemy {
    private final double lowerLimitCriticalDamage = 1.7;

    private final double upperLimitCriticalDamage = 2.25;

    private final int damage = 15;

    public Rogue(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        if (isAlive()) {
            setHealth(getHealth() - damage);
            System.out.println("Rogue took " + damage + " damage. Rogue health: " + getHealth());
        }
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Rogue attacked the hero");
        if (new Random().nextInt(2) == 1) {
            hero.takeDamage((int) (damage * new Random()
                    .nextDouble(lowerLimitCriticalDamage, upperLimitCriticalDamage)));
            System.out.println("\nROGUE DEALT CRITICAL DAMAGE!!!\n");
        } else {
            hero.takeDamage(damage);
        }
    }
}
