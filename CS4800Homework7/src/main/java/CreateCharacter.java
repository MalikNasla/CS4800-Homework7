public class CreateCharacter {
    char newCharacter;
    Character properties;

    public CreateCharacter(char newCharacter, Character properties){
        this.newCharacter = newCharacter;
        this.properties = properties;
    }

    public char getNewCharacter() {
        return newCharacter;
    }

    public Character getProperties() {
        return properties;
    }
}
