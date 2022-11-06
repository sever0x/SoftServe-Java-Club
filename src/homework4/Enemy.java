package homework4;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        if (isAlive()) {
            setHealth(getHealth() - damage);
            System.out.println("Enemy took " + damage + " damage. Enemy health: " + getHealth());
        }
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
