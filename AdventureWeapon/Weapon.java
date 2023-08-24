public class Weapon {
    private final String name;
    private final int damage;

    public Weapon(String name, int damage){
        this.name = name;
        this.damage = damage;
    }
    public String getName(){
        return this.name;
    }

    public int getDamage(){
        return this.damage;
    }

    public String toString(){
        return name + " deals " + damage + " damages";
    }
}