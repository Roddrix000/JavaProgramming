package Java8_Programming;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

@FunctionalInterface
interface Printable {

    void print(String msg);
}

public class Object_Method_Ref {

    public void display(String msg) {
        msg = msg.toUpperCase();
        System.out.println(msg);
    }


    public static void main(String[] args) {
        Object_Method_Ref obj = new Object_Method_Ref();
        // Lambda Expression
        Printable printable= (msg) ->obj.display(msg);
        printable.print("Hello world!");

        //Using Method reference

        Printable printable1 = obj::display;
        printable1.print("ronald fredrick");

        //Lamdba Expression for instance of Orbitory

        Function<String,String> functionv1=(String input) -> input.toLowerCase();
        System.out.println(functionv1.apply("RONALD"));

        //Method Reference
        Function<String,String> functionv2=String::toLowerCase;
        System.out.println(functionv2.apply("SWATHI"));

        List<String> fruits= new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("PineApple");
        fruits.add("Watermelon");

        Function<List<String>, Set<String>> function1= (fruitList)-> new HashSet<>(fruitList);
        System.out.println(function1.apply(fruits));


        Function<List<String>, Set<String>> function3=  HashSet :: new;
        System.out.println(function3.apply(fruits));




    }

}
