import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextEditor {
    StringBuilder desiredString = new StringBuilder();

    public void addCharacter(char newCharacter, String font, String color, int size){
        Character characterProperties = CharacterFactory.getCharacter(font, color, size);
        CreateCharacter create = new CreateCharacter(newCharacter, characterProperties);
        desiredString.append(create.getNewCharacter());
    }

    public void writeToFile(String fname) throws IOException {
        FileWriter writer = new FileWriter(fname);
        writer.write(desiredString.toString());
        writer.close();
    }

    public void loadFromFile(String fname) throws IOException {
        String i;
        BufferedReader read = new BufferedReader(new FileReader(fname));
        System.out.println("Printing From File:");
        while ((i = read.readLine()) != null){
            System.out.println(i);
        }
    }

    public String getString(){
        return desiredString.toString();
    }
}
