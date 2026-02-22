package prototype;

public class Armor implements Cloneable {
    public String name;
    public int defense;

    public Armor(String n, int d) {
        name = n;
        defense = d;
    }

    public Armor clone() {
        try { return (Armor) super.clone(); }
        catch (Exception e) { throw new RuntimeException(e); }
    }
}
