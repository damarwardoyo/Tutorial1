
public class Character {
    protected String name;
    protected int attack;

    public Character(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    public void added() {
        System.out.println("Added a character.");
    }

    public int damage() {
        return attack;
    }

    public void attack() {
        System.out.println(name + " attacked! Damage: " + this.damage() + ".");
    }

    public int magicDamage() {
        return attack;
    }

    public void magic() {
        System.out.println(name + " casted a magic! Damage: " + this.magicDamage() + ".");
    }

}
