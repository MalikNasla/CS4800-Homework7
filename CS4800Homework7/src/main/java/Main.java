import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TextEditor text = new TextEditor();

        text.addCharacter('H', "Arial", "Red", 12);
        text.addCharacter('e', "Calibri", "Blue", 14);
        text.addCharacter('l', "Verdana", "Black", 16);
        text.addCharacter('l', "Arial", "Blue", 14);
        text.addCharacter('o', "Arial", "Red", 12);
        text.addCharacter('W', "Calibri", "Blue", 14);
        text.addCharacter('o', "Verdana", "Black", 16);
        text.addCharacter('r', "Arial", "Blue", 14);
        text.addCharacter('l', "Arial", "Red", 12);
        text.addCharacter('d', "Calibri", "Blue", 14);
        text.addCharacter('C', "Verdana", "Black", 16);
        text.addCharacter('S', "Arial", "Blue", 14);
        text.addCharacter('4', "Arial", "Red", 12);
        text.addCharacter('8', "Calibri", "Blue", 14);
        text.addCharacter('0', "Verdana", "Black", 16);
        text.addCharacter('0', "Calibri", "Black", 10);

        text.writeToFile("text.txt");
        text.loadFromFile("text.txt");


    }

}
