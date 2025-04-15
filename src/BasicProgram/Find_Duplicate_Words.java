package BasicProgram;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_Duplicate_Words {

    public static String sentence = "Big black bug bit a big black dog on his big black nose";

    public static void main(String[] args) {

        List<String> wordsList = Arrays.asList(sentence.split(" "));

        // Find duplicate words using Streams
        List<String> duplicateWords = wordsList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Count occurrences
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // Keep only words that appear more than once
                .map(Map.Entry::getKey) // Extract the duplicate words
                .collect(Collectors.toList());
        System.out.println("Duplicate words: " + duplicateWords);



    }

}
