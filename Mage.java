package characters;

import javax.swing.*;

public class Mage extends Character {
    public Mage(String name) {
        super(name, 100, 20);
    }

    @Override
    public int attack() {
        JOptionPane.showMessageDialog(null, name + " casts Fireball! (-" + attackDamage + " HP)");
        return attackDamage;
    }

    @Override
    public int specialMove() {
        int dmg = attackDamage + 10;
        JOptionPane.showMessageDialog(null, name + " summons Lightning Bolt! (-" + dmg + " HP)");
        return dmg;
    }

    @Override
    public int secretPower() {
        int dmg = attackDamage + 25;
        JOptionPane.showMessageDialog(null, name + " unleashes Meteor Storm! (-" + dmg + " HP)");
        return dmg;
    }
}
