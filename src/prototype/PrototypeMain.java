package main;

import prototype.*;

public class PrototypeMain {

    public static void main(String[] args) {

        Character base = new Character();
        base.hp = 100;
        base.str = 20;
        base.weapon = new Weapon("Sword",30);
        base.armor = new Armor("Steel",15);
        base.skills.add(new Skill("Fireball"));

        Character clone = base.clone();
        clone.weapon.name = "Axe";

        System.out.println(base.weapon.name);
        System.out.println(clone.weapon.name);
    }
}
