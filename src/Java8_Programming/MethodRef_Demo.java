package Java8_Programming;

import java.util.function.Function;


public class MethodRef_Demo {


    public static void main(String[] args) {

        //using Lambda Expression
        Function<Integer,Double> function=(input) -> Math.sqrt(input);
        System.out.println(function.apply(4));

        //Using Method Reference

        Function<Integer,Double> functionlRef= Math :: sqrt;
        System.out.println(functionlRef.apply(4));

    }
}
