package Java_8_Package;

import javax.sound.midi.Soundbank;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Working_Count_Min_And_Max {

    public static void main(String[] args) {

        Stream<Integer> list1 = Stream.of(1, 5, 8, 10, 9);
        //Count() will return the nuber of Methods
        System.out.println("Total Number Of Elements " + list1.count());

        System.out.println("Finding the minimum Value");
        System.out.println(Stream.of(1, 5, 8, 10, 9).min(Comparator.comparing(Integer::valueOf)).get());

        System.out.println("Find the Maximum Value");
        System.out.println(Stream.of(1, 5, 8, 10, 9).max(Comparator.comparing(Integer::valueOf)).get());
    }
}
