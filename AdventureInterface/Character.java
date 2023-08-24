import java.util.List;
import java.util.ArrayList;
public class Character{
    private final int maxHealth;
    private int currentHealth;
    private final String name;

    private static List<Character> allCharacters = new ArrayList<>();

    public Character(String name, int maxHealth){
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        allCharacters.add(this);
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

    public static String printStatus() {
        StringBuilder status = new StringBuilder();
        status.append("------------------------------------------\n");
        if (allCharacters.isEmpty()) {
            status.append("Nobody's fighting right now !\n");
        } else {
            status.append("Characters currently fighting :\n");
            for (Character character : allCharacters) {
                status.append(" - ").append(character.toString()).append("\n");
            }
        }
        status.append("------------------------------------------\n");
        return status.toString();
    }

    public static Character fight(Character character1, Character character2) {
        while (character1.getCurrentHealth() > 0 && character2.getCurrentHealth() > 0) {
            character1.attack(character2);
            if (character2.getCurrentHealth() <= 0) {
                return character1;
            }

            character2.attack(character1);
            if (character1.getCurrentHealth() <= 0) {
                return character2;
            }
        }

        // If both characters' health reaches 0 simultaneously, return null
        return null;
    }
    public String toString(){
        if (this.currentHealth == 0){
            return this.name + " : KO";
        }

        return this.name + " : " + this.currentHealth + "/" + this.maxHealth;
    }
}