package BasicProgram;

import java.io.InputStream;
import java.util.HashMap;

public class Program_Check_Number_Of_Characters {

    public static void main(String[] args) {
        String name = "RonaldRoss";
        //split
        HashMap<Character, Integer> value = new HashMap<>();
        char[] splitValues = name.toCharArray();

        for (char c : splitValues) {
            if (value.containsKey(c)) {
                value.put(c, value.get(c) + 1);
            } else {
                value.put(c, 1);
            }
        }


        System.out.println(value);
    }
}
