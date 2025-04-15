package Java8_Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Seperate_Odd_And_Even {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1, 4, 7, 11, 12, 16, 14,13);
        List<Integer> evenNumber = new ArrayList<Integer>();
        List<Integer> oddNumbers = new ArrayList<Integer>();
        //Now trying with Traditional Way
        for (Integer ele : number) {
            if (ele % 2 == 0) {
                evenNumber.add(ele);
            } else {
                oddNumbers.add(ele);
            }
        }
        System.out.println("Even Number" + evenNumber);
        System.out.println("Odd Number" + oddNumbers);


        // Using Stream API

        Map<Boolean, List<Integer>> data = number.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(data);

    }
}
