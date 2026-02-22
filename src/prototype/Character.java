package prototype;

import java.util.*;

public class Character implements Cloneable {

    public int hp, str, agi, intel;
    public Weapon weapon;
    public Armor armor;
    public List<Skill> skills = new ArrayList<>();

    public Character clone() {
        try {
            Character c = (Character) super.clone();
            c.weapon = weapon.clone();
            c.armor = armor.clone();

            c.skills = new ArrayList<>();
            for (Skill s : skills) c.skills.add(s.clone());

            return c;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
