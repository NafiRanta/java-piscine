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

}