package Java8_Programming;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sum_Of_Digits {

    public static void main(String[] args) {

        int number = 1575;
        String tempNumber = String.valueOf(number);
        System.out.println(tempNumber);
        String[] numberList = tempNumber.split("");
        int sum = 0;
        for (String s : numberList) {
            sum = sum + Integer.parseInt(s);
        }
        System.out.println("Sum of Digits " + sum);
        // Using Stream API
        Integer sumValue = Stream.of(String.valueOf(number).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sumValue);
    }
}
