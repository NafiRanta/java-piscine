public class Templar extends Character implements Tank, Healer{
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield){
        super(name, maxHealth);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    public int getShield(){
        return this.shield;
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

    public void attack(Character character) {
        this.heal(this);
        character.takeDamage(6);
    }


    public void takeDamage(int damage) {
        int remainHealth = this.getCurrentHealth() - (damage - this.getShield());
        if (remainHealth < 0) {
            this.setCurrentHealth(0);
        } else {
            this.setCurrentHealth(remainHealth);
        }
    }

    public String toString() {
        if (getCurrentHealth() == 0) {
            return getName() + " has been beaten, even with its " + shield + " shield. So bad, it could heal " + healCapacity + " HP.";
        }
        return getName() + " is a strong Templar with " + getCurrentHealth() + " HP. It can heal " + healCapacity + " HP and has a shield of " + shield + ".";
    }
}