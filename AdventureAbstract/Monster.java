public class Monster extends Character{
    public Monster(String name, int maxHealth){
        super(name, maxHealth);
    }

    public void attack(Character character){
        character.takeDamage(7);
    }

    public void takeDamage(int damage) {
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
            return getName() + " is a monster with " + getCurrentHealth() + " HP";
        } else {
            return getName() + " is a monster and is dead";
        }
    }



}
