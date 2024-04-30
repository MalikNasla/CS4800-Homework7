import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CharacterFactoryTest {

    @Test
    public void testGetCharacter(){
        Character character1 = CharacterFactory.getCharacter("Arial", "Black", 12);
        Character character2 = CharacterFactory.getCharacter("Arial", "Black", 12);
        assertNotNull(character1);
        assertNotNull(character2);
        assertEquals(character1, character2);
    }
}
