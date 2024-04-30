import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateCharacterTest {

    @Test
    public void CreateCharacterTest(){
        Character character = new Character("Arial", "Black", 12);
        CreateCharacter createCharacter = new CreateCharacter('a', character);
        assertEquals('a', createCharacter.getNewCharacter());
        assertEquals(character, createCharacter.getProperties());
    }
}
