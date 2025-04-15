package Java8_Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Duplicate_Elements {


    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(0,2, 4, 6, 7, 2, 1, 0, 6, 12,4);
        System.out.println("Checking using traditional Method");

        List<Integer> num = new ArrayList<>();
        for (Integer num1 : numberList) {
            if (num.contains(num1)) {
              //  System.out.println(num1);
            } else {
                num.add(num1);
            }
        }
        System.out.println("After Sorting the value");
        System.out.println(num);

        System.out.println("Now using Stream API");
        numberList.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
    }

}
