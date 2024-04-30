import java.util.HashMap;

public class CharacterFactory {
    static HashMap<String, Character> map = new HashMap<>();

    public static Character getCharacter(String font, String color, int size){
        String properties = font + color + size;

        if(!map.containsKey(properties)){
            map.put(properties, new Character(font, color, size));
        }
        return map.get(properties);
    }
}
