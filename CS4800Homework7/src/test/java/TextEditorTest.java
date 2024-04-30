import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextEditorTest {

    TextEditor text = new TextEditor();
    String fname = "testFile.txt";

    @Test
    public void testAddCharacter() {
        text.addCharacter('A', "Arial", "Black", 12);
        assertEquals("A", text.getString());
    }

    @Test
    public void testWriteToFile() throws IOException {
        text.addCharacter('A', "Arial", "Black", 12);
        text.writeToFile(fname);
        text.loadFromFile(fname);
    }
}
