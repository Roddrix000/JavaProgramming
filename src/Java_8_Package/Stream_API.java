package Java_8_Package;

import java.util.*;
import java.util.stream.Stream;

public class Stream_API {


    public static void main(String[] args) {
        System.out.println("Creating a Stream");
        Stream<String> streamObj = Stream.of("a", "b", "c");
        streamObj.forEach(System.out::println);


        //
        System.out.println("Creating a Stream from a Source");

        Collection<String> collectionObj = Arrays.asList("Java", "Python", "J2EE", "Shell Scripting");
        Stream<String> collectionStream = collectionObj.stream();
        collectionStream.forEach(System.out::println);

        //
        System.out.println("Creating a stream from List");

        List<String> listobj = Arrays.asList("Bangalore", "Chennai", "Mumbai", "Hyderabad");
        Stream<String> listStream = listobj.stream();
        listStream.forEach(System.out::println);

        //
        System.out.println("Creating a Stream from set");
        Set<String> setObj = new HashSet<>(listobj);
        Stream<String> setStream = setObj.stream();
        setStream.forEach(System.out::println);

        System.out.println("Creating a Stream from Arrays");

        String[] strArray= {"MOM","DAD","FRIENDS","PANNI"};
        Stream<String> streamArrays= Arrays.stream(strArray);
        streamArrays.forEach(System.out::println);
        

    }
}
