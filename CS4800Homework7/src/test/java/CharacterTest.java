import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class CharacterTest {

    @Test
    public void testCharacter(){
        Character character = new Character("Arial", "Black", 12);
        assertNotNull(character);
        assertEquals("Arial", character.getFont());
        assertEquals("Black", character.getColor());
        assertEquals(12, character.getSize());
    }
}
