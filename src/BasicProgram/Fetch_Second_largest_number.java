package BasicProgram;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Fetch_Second_largest_number {

    public static <list> void main(String[] args) {

        //first we will remove the duplicates

        List<Integer> list = Arrays.asList(2, 3, 1, 6, 9, 9,7,5,5);
//
//        for (int i = 0; i < arr.length; i++) {
//            if (!list.contains(arr[i])) {
//                list.add(arr[i]);
//            }
//        }
        System.out.println("Duplicate removed list" + list);

        list = list.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
        System.out.println("Duplicate removed list" + list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Second largest is " + list.get(i + 1));
            break;
        }


    }
}
