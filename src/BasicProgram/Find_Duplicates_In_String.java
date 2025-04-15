package BasicProgram;

import java.util.HashMap;
import java.util.Set;

public class Find_Duplicates_In_String {

    public static void main(String[] args) {

        String name = "HelloThere";

        HashMap<Character, Integer> nameMap = new HashMap<>();
        char[] nameArray = name.toCharArray();
        for (char c : nameArray) {
            if (nameMap.containsKey(c)) {
                nameMap.put(c, nameMap.get(c) + 1);
            } else {
                nameMap.put(c, 1);
            }
        }
       System.out.println(nameMap);
        //Storing the key value into Set
        Set<Character> nameMapKeys = nameMap.keySet();
        System.out.println(nameMapKeys);
        for (char c : nameMapKeys) {
            if (nameMap.get(c) > 1) {
                System.out.println(c + " is repeadted " + nameMap.get(c));
            }
        }


    }
}
