import java.util.HashMap;

/**
 * Create by saurabh
 * Date: 26/02/24
 * Project Name: Java-8
 */

public class map {
    public static void main(String[] args) {
        String str = "dfgdgdhgfdgfhgfdghgfdazz";
        characterCount(str);
    }

    private static void characterCount(String str) {
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for(int i =0;i< str.length();i++){
            Character character = str.charAt(i);
            characterIntegerHashMap.computeIfPresent(character,(chars,count)->count+1);
            characterIntegerHashMap.computeIfAbsent(character,chars->1);
        }
        System.out.println(characterIntegerHashMap);
    }
}
