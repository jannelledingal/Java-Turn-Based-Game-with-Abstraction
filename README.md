# Java-Turn-Based-Game-with-Abstraction
CCE105L Data Structures &amp; Algorithms Assignment 1

# ⚔️ Mage vs Warrior Battle Game

This is a simple **turn-based battle game** in Java that uses **Object-Oriented Programming (OOP)** principles and `JOptionPane` for a graphical user interface.  

The game features two characters, **Mage** and **Warrior**, each with unique abilities and attack styles. Players take turns choosing moves until one character’s HP reaches 0, or the player decides to exit.

---

## ✨ Features
- **Abstract Class `Character`** (with `Mage` and `Warrior` subclasses)
- **HP (Health Points):** both start at 100
- **Turn-based system:** players attack in alternating turns
- **3 Move Types + Exit Option:**
  - **Basic Attack**
  - **Special Move**
  - **Secret Power**
  - **Exit (quit game early)**
- Winner is displayed when a character’s HP reaches 0

---

## 🗡️ Characters & Attacks

### 🧙 Mage
| Move | Name | Damage |
|------|------|---------|
| Attack | Fireball | 20 |
| Special Move | Lightning Bolt | 30 |
| Secret Power | Meteor Storm | 45 |

### 🛡️ Warrior
| Move | Name | Damage |
|------|------|---------|
| Attack | Sword Slash | 15 |
| Special Move | Mighty Strike | 30 |
| Secret Power | Whirlwind Attack | 45 |

---

## 📂 Project Structure

src/
 ├── characters/
 │     ├── Character.java   # Abstract base class
 │     ├── Mage.java        # Mage subclass
 │     └── Warrior.java     # Warrior subclass
 └── game/
       └── BattleGame.java  # Main game loop

---

EXAMPLE BATTLE FLOW:
----------------------------------------------------------------
*Enter Player Names* 

![Mage Name](<img width="315" height="151" alt="image" src="https://github.com/user-attachments/assets/bd453d98-5944-41e9-a112-2d5b53e43ea4" />)

![Warrior Name](<img width="304" height="139" alt="image" src="https://github.com/user-attachments/assets/1c1f791b-5d82-4846-b908-dd70c55d5cf8" />)

----------------------------------------------------------------
*Battle Starts*

![Start](<img width="268" height="148" alt="image" src="https://github.com/user-attachments/assets/74fa9e55-fbf2-4697-af0b-4b2b0510875e" />) 

----------------------------------------------------------------
*Choose a Move*      

![Mage Move](<img width="411" height="126" alt="image" src="https://github.com/user-attachments/assets/bd99081f-7154-419e-b252-5dd3a3ad3c21" />) 
![Mage Power](<img width="313" height="126" alt="image" src="https://github.com/user-attachments/assets/d644b717-0642-49f8-9406-82bfafcc1f85" />) 

![Warrior Move](<img width="408" height="123" alt="image" src="https://github.com/user-attachments/assets/0257b363-ee17-41b6-bd7d-fb90b5c2b8a6" />) 
![Warrior Power](<img width="318" height="126" alt="image" src="https://github.com/user-attachments/assets/49eaebba-f839-407b-b7a8-694ced981c25" />
) 

----------------------------------------------------------------
*HP Status*  

![Status if both chose to use Secret Power](<img width="269" height="147" alt="image" src="https://github.com/user-attachments/assets/01568cef-4193-425c-af87-134346a0357b" />) 

continue until one player HP turns to 0...
----------------------------------------------------------------
*Winner Screen* 

![Winner](<img width="265" height="123" alt="image" src="https://github.com/user-attachments/assets/3a467d4e-828c-4fdf-a2ef-660287c0772e" />
)


✍️ Author: JANNELLE DINGAL
