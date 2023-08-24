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

    public void attack(Character character){
        this.heal(this);
        character.takeDamage(10);
    }

    public void takeDamage(int damage) {
        int remainHealth = this.getCurrentHealth() - damage;
        if (remainHealth < 0) {
            this.setCurrentHealth(0);
        } else {
            this.setCurrentHealth(remainHealth);
        }
    }


    public String toString() {
        if (getCurrentHealth() == 0) {
            return getName() + " is a dead sorcerer. So bad, it could heal " + healCapacity + " HP.";
        }
        return getName() + " is a sorcerer with " + getCurrentHealth() + " HP. It can heal " + healCapacity + " HP.";
    }

}