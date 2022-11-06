package homework4.heroes;

import homework4.Enemy;

public abstract class Hero {
    private String name;
    private int health = 100;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);
}
