package homework4.heroes;

import homework4.enemies.Enemy;

public abstract class Hero {
    private String name;

    private int health = 100;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage) {
        if (isAlive()) {
            setHealth(getHealth() - damage);
            System.out.println("Hero took " + damage + " damage. Hero health: " + getHealth());
        }
    }

    public boolean isAlive() {
        return getHealth() > 0;
    }
}
