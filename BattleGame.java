//DINGAL CCE105L(2803) ACT1 08/26/2025

package game;

import characters.*;
import characters.Character;

import javax.swing.*;

public class BattleGame {
    public static void main(String[] args) {
        
        String mageName = JOptionPane.showInputDialog("Enter Mage's name:");
        if (mageName == null) System.exit(0); 
        String warriorName = JOptionPane.showInputDialog("Enter Warrior's name:");
        if (warriorName == null) System.exit(0);

        Mage mage = new Mage(mageName);
        Warrior warrior = new Warrior(warriorName);

        JOptionPane.showMessageDialog(null,
            "Battle begins!\n" +
            mage.getName() + " vs " + warrior.getName() + "\nBoth start with 100 HP."
        );

        boolean mageTurn = true;
        boolean gameRunning = true;

        while (mage.isAlive() && warrior.isAlive() && gameRunning) {
            Character attacker = mageTurn ? mage : warrior;
            Character defender = mageTurn ? warrior : mage;

            String[] options = {"Attack", "Special Move", "Secret Power", "Exit"};
            int choice = JOptionPane.showOptionDialog(
                null,
                attacker.getName() + ", choose your move:",
                "Choose Move",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
            );

            int damage = 0;
            switch (choice) {
                case 0: damage = attacker.attack(); break;
                case 1: damage = attacker.specialMove(); break;
                case 2: damage = attacker.secretPower(); break;
                case 3: // Exit
                case JOptionPane.CLOSED_OPTION:
                    JOptionPane.showMessageDialog(null, "Game exited. Thanks for playing!");
                    gameRunning = false;
                    continue; 
                default:
                    damage = attacker.attack();
            }

            defender.takeDamage(damage);

            JOptionPane.showMessageDialog(null,
                "HP Status:\n" +
                mage.getName() + ": " + mage.getHp() + " HP\n" +
                warrior.getName() + ": " + warrior.getHp() + " HP"
            );

            mageTurn = !mageTurn;
        }

        if (gameRunning) { 
            String winner = mage.isAlive() ? mage.getName() : warrior.getName();
            JOptionPane.showMessageDialog(null, "🎉 " + winner + " wins the battle!");
        }
    }
}
