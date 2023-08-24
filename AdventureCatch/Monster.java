public class Monster extends Character{
    public Monster(String name, int maxHealth, Weapon weapon){
        super(name, maxHealth, weapon);
    }

    public void attack(Character character) throws DeadCharacterException{
        if (getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }

        if (getWeapon()!= null){
            character.takeDamage(getWeapon().getDamage());
        }else {
            character.takeDamage(7);
        }
    }

    public void takeDamage(int damage) throws DeadCharacterException{
        if (getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }

        int remainHealth = this.getCurrentHealth() - (int)Math.floor(damage * 0.8);
        if (remainHealth < 0) {
            this.setCurrentHealth(0);
        } else {
            this.setCurrentHealth(remainHealth);
        }
    }

    @Override
    public String toString() {
        if (getCurrentHealth() > 0) {
            return getName() + " is a monster with " + getCurrentHealth() + " HP. He has the weapon " + getWeapon().getName() + " deals " + getWeapon().getDamage() + "damages.";
        } else {
            return getName() + " is a monster and is dead. He has the weapon " + getWeapon().getName() + " deals " + getWeapon().getDamage() + "damages.";
        }
    }



}
