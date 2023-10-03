package Lambdas;

import com.sun.jdi.Value;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

public class TesteLambda {
    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            return a + b;
        };
        int result =  intBinaryOperator.applyAsInt(10, 12);
        System.out.println(result);

        BiFunction<Integer, Integer, Integer> biFunction = (Integer a, Integer b) ->{
            return a + b;
        };
        Integer resultBi = biFunction.apply(50, 50);
        System.out.println(resultBi);

        BiFunction<Double,Double,String> biFunctionStr = (Double a,Double b) -> {
            Double re = a+b;
            return String.valueOf(re);
        };
        String biFunctions1 = biFunctionStr.apply(25d,25d);
        System.out.println("String: " + biFunctions1);

        Runnable hello_world = () -> System.out.println("Hello World");
        Consumer<String> stringConsumer = (String s) -> {
            System.out.println(s);
        };
        stringConsumer.accept("Value");

        Supplier<Integer> integerCallabe = () -> 42;
        Supplier<Double> doubleCallabe = () -> {
            return 3.1415;
        };
    }
}
