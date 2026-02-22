package prototype;

public class Skill implements Cloneable {
    public String name;

    public Skill(String n) { name = n; }

    public Skill clone() {
        try { return (Skill) super.clone(); }
        catch (Exception e) { throw new RuntimeException(e); }
    }
}
