public class Character{
    private final int maxHealth;
    private int currentHealth;
    private final String name;

    public Character(String name, int maxHealth){
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }
    public int getMaxHealth(){
        return this.maxHealth;
    }

    public int getCurrentHealth(){
        return this.currentHealth;
    }

    public String getName(){
        return this.name;
    }

    public void takeDamage(int damage) {
        if (this.currentHealth > damage) {
            this.currentHealth -= damage;
        } else {
            this.currentHealth = 0;
        }
    }

    public void attack(Character character){
       character.takeDamage(9);
    }
    public String toString(){
        if (this.currentHealth == 0){
            return this.name + " : KO";
        }

        return this.name + " : " + this.currentHealth + "/" + this.maxHealth;
    }
}