package characters;

import javax.swing.*;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name, 100, 15);
    }

    @Override
    public int attack() {
        JOptionPane.showMessageDialog(null, name + " slashes with his/her sword! (-" + attackDamage + " HP)");
        return attackDamage;
    }

    @Override
    public int specialMove() {
        int dmg = attackDamage + 15;
        JOptionPane.showMessageDialog(null, name + " performs a Mighty Strike! (-" + dmg + " HP)");
        return dmg;
    }

    @Override
    public int secretPower() {
        int dmg = attackDamage + 30;
        JOptionPane.showMessageDialog(null, name + " unleashes Whirlwind Attack! (-" + dmg + " HP)");
        return dmg;
    }
}

