package Java_8_Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst_FindAny_StreamAPI {

    public static void main(String[] args) {


        List<Integer> element = Arrays.asList(2, 3, 2, 1);
        //FindFirst Method
        if (element.stream().findFirst().isPresent()) {
            System.out.println(element.stream().findFirst().get());
        } else {
            System.out.println("Empty Stream");
        }


        //FindAny


        if (element.stream().findAny().isPresent()) {
            System.out.println(element.stream().findAny().get());
        } else {
            System.out.println("Stream is empty");
        }


    }

}
