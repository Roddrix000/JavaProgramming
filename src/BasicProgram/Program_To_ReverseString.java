package BasicProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Program_To_ReverseString {
    public static String revName = "";

    public static void main(String[] args) {

        String name = "RahulShettyAcademy";

        //Split using
        String[] nameArray = name.split("");

        for (int i = nameArray.length - 1; i >= 0; i--) {
            // System.out.println(nameArray[i]);
            revName = revName.concat(nameArray[i]);
        }
        System.out.println("Before Name :> " + name);
        System.out.println("After Swapping Name :> " + revName);

        String streamRevName = IntStream.range(0, name.length())
                .mapToObj(i -> String.valueOf(name.charAt(name.length() - 1 - i)))
                .collect(Collectors.joining());
        System.out.println(streamRevName);

    }
}
