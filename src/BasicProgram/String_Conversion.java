package BasicProgram;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class String_Conversion {

    public static void main(String[] args) {

        String inputvalue = "a2b3c4";
        String outPutvalue = "aabbbcccc";
        //Checking if the character is Alphabet

        for (int i = 0; i < inputvalue.length(); i++) {
            if (Character.isAlphabetic(inputvalue.charAt(i))) {

            } else {
                int countvalue = Character.getNumericValue(inputvalue.charAt(i));
                for (int j = 0; j < countvalue; j++) {
                    System.out.print(inputvalue.charAt(i - 1));
                }
            }
        }
    }
}
