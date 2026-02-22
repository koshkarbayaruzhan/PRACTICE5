package prototype;

public class Weapon implements Cloneable {
    public String name;
    public int damage;

    public Weapon(String n, int d) {
        name = n;
        damage = d;
    }

    public Weapon clone() {
        try { return (Weapon) super.clone(); }
        catch (Exception e) { throw new RuntimeException(e); }
    }
}
