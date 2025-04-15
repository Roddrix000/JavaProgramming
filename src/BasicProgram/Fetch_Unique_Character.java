package BasicProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Fetch_Unique_Character {


    public static char firstNonRepeat(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        return '_';
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeat("GeeksForGeeks"));

    }
}