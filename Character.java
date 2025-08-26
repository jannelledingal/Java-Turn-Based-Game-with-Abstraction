package characters;

public abstract class Character {
    protected String name;
    protected int hp;
    protected int attackDamage;

    public Character(String name, int hp, int attackDamage) {
        this.name = name;
        this.hp = hp;
        this.attackDamage = attackDamage;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void takeDamage(int damage) {
        this.hp -= damage;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public abstract int attack();      
    public abstract int specialMove(); 
    public abstract int secretPower(); 
}

