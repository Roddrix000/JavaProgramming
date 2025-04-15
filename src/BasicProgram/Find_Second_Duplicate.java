package BasicProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Find_Second_Duplicate {


    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(2, 3, 1, 8, 6, 9, 9, 7, 5, 5, 7, 8);
        List<Integer> once = new ArrayList<>();
        List<Integer> repeated = new ArrayList<>();
        for (Integer i : numberList) {
            if (!once.contains(i.intValue())) {
                once.add(i.intValue());
            } else {
                repeated.add(i.intValue());
            }

        }
        //using stream to sort
        repeated = repeated.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(repeated.get(1));
//        for (int i = 0; i < repeated.size(); i++) {
//            System.out.println(repeated.get(i + 1));
//            break;
//        }
    }

}
