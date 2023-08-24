public class Templar extends Character implements Tank, Healer{
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon){
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    public int getShield(){
        return this.shield;
    }

    public int getHealCapacity(){
        return this.healCapacity;
    }

    public void heal(Character character) throws DeadCharacterException{
        if (getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        int newHealth = character.getCurrentHealth() + healCapacity;

        if (newHealth <= character.getMaxHealth()){
            character.setCurrentHealth(newHealth);
        } else {
            character.setCurrentHealth(20);
        }
    }

    public void attack(Character character) throws DeadCharacterException{
        if (getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        this.heal(this);
        if (getWeapon()!= null){
            character.takeDamage(getWeapon().getDamage());
        }else {
            character.takeDamage(6);
        }
    }


    public void takeDamage(int damage) throws DeadCharacterException{
        if (getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        int remainHealth = this.getCurrentHealth() - (damage - this.getShield());
        if (remainHealth < 0) {
            this.setCurrentHealth(0);
        } else {
            this.setCurrentHealth(remainHealth);
        }
    }

    public String toString() {
        if (getCurrentHealth() == 0) {
            return getName() + " has been beaten, even with its " + shield + " shield. So bad, it could heal " + healCapacity + " HP. He has the weapon " + getWeapon().getName() + " deals " + getWeapon().getDamage() + "damages.";
        }
        return getName() + " is a strong Templar with " + getCurrentHealth() + " HP. It can heal " + healCapacity + " HP and has a shield of " + shield + ". He has the weapon " + getWeapon().getName() + " deals " + getWeapon().getDamage() + "damages.";
    }
}