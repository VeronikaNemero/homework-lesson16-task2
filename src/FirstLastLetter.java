import java.util.HashMap;
import java.util.Map;

public class FirstLastLetter {

    public static Map<String, String> putLetters(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String string : strings) {
            if (!string.isEmpty()) {
                char firstLetter = string.charAt(0);

                char lastLetter = string.charAt(string.length() - 1);

                map.put(String.valueOf(firstLetter), String.valueOf(lastLetter));
            }
        }
        return map;
    }
}
