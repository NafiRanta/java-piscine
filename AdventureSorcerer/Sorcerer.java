public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity){
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    public int getHealCapacity(){
        return this.healCapacity;
    }

    public void heal(Character character){
        int newHealth = character.getCurrentHealth() + healCapacity;
        if (newHealth <= character.getMaxHealth()){
          character.setCurrentHealth(newHealth);
        } else {
            character.setCurrentHealth(20);
        }
    }


    public String toString() {
        if (getCurrentHealth() == 0) {
            return getName() + " is a dead sorcerer. So bad, it could heal " + healCapacity + " HP.";
        }
        return getName() + " is a sorcerer with " + getCurrentHealth() + " HP. It can heal " + healCapacity + " HP.";
    }

    public static void main(String[] args) {
        Sorcerer gandalf = new Sorcerer("Gandalf", 20, 5);
        Character frodon = new Character("Frodon", 20);
        Sorcerer saroumane = new Sorcerer("saroumane", 10, 3);

        Character.fight(frodon, saroumane);

        gandalf.heal(frodon);

        System.out.println(Character.printStatus());
    }
}