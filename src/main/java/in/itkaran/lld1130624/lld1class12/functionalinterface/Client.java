package in.itkaran.lld1130624.lld1class12.functionalinterface;

import java.util.function.*;

public class Client {

    public static void main(String[] args) {
        demoFunctionalInterface();
    }

    private static void demoFunctionalInterface() {
        SampleFunctionalInterface obj = new SampleFunctionalInterface() {
            @Override
            public void fun() {
                System.out.println("fun");
            }
        };
        obj.fun();

        // BiConsumer
        BiConsumer<String, Integer> biConsumer = new BiConsumer<>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s + " " + integer);
            }
        };
        biConsumer.accept("Scaler", 5);

        /*
        1. Consumer;
        2. BiConsumer;
        3. Predicate<String> predicate = new Predicate<String>() {};
        4. BiPredicate;
        5. Function<String, String> function = new Function<String, String>() {};
        6. BiFunction;
        7. BinaryOperator extends BiFunction;
         */


    }
}
