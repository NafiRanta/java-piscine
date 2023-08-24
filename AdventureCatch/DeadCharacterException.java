public class DeadCharacterException extends Exception{
    private Character character;

    public DeadCharacterException(Character character){
        this.character = character;
    }

    public String getMessage(){
        String characterType = "";

        if (character instanceof Sorcerer){
            characterType = "sorcerer";
        } else if (character instanceof Monster){
            characterType = "monster";
        } else {
            characterType = "templar";
        }

        return "The " + characterType + " " + character.getName() + " is dead.";
    }
}