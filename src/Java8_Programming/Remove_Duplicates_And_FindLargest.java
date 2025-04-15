package Java8_Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Remove_Duplicates_And_FindLargest {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 8, 3, 7, 6, 5, 8);
        List<Integer> finalList = new ArrayList<>();
        for (Integer num : numbers) {
            if (!finalList.contains(finalList)) {
                finalList.add(num);
            }
        }
        //Finding Max number
        int max = 0;
        for (Integer temp : finalList) {
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println("The Largest number is " + max);

        //Using Java Stream

        Integer max1 = numbers.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println("Max number obtained from Stream " + max1);
    }
}
