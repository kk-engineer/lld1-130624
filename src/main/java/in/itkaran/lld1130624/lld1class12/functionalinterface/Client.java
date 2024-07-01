package in.itkaran.lld1130624.lld1class12.functionalinterface;

import in.itkaran.lld1130624.lld1class9.semaphores.Consumer;

import java.util.function.BiConsumer;

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
    }
}
