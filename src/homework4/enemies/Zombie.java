package homework4.enemies;

import homework4.heroes.Hero;

public class Zombie extends Enemy {
    private final int initHealth = getHealth();

    private final int damage = 10;

    private int lives = 1;

    public Zombie(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        if (isAlive()) {
            setHealth(getHealth() - damage);
            System.out.println("The zombie took " + damage + " damage. Zombie health: " + getHealth());
            if (lives == 1 && getHealth() <= 0) {
                lives--;
                setHealth(initHealth);
                System.out.println("Zombie has been resurrected");
            } else if (lives == 0 && getHealth() <= 0) {
                System.out.println("Zombie is dead");
            }
        }
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Zombie attacked the hero");
        hero.takeDamage(damage);
    }
}
