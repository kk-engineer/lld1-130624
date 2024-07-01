package in.itkaran.lld1130624.lld1class12.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class Client {
    public static void main(String[] args) {

        //demoLambdas();
        //demoConcreteExamples();
        demoComparator();
    }

    private static void demoLambdas() {
        Consumer<String> consumer = (str) -> {
            System.out.println(str);
        };
        consumer.accept("Scaler");

        BiConsumer<String, Integer> biConsumer = (str, num) -> {
            System.out.println(str + " " + num);
        };
        biConsumer.accept("Scaler", 2);

        BiConsumer<String, Integer> biConsumer2 = (str, num) -> System.out.println(str + " " + num);
        biConsumer2.accept("Scaler", 5);

        BinaryOperator<Integer> binaryOperator = (num1, num2) -> num1 + num2;
        System.out.println(binaryOperator.apply(10, 15));

        Predicate<String> predicate = (str) -> {
            if (str.length() > 5 ) return true;
            return false;

            // return str.length() > 5;
        };
        System.out.println(predicate.test("Scaler"));
        Predicate<String> predicate2 = (str)-> str.length() > 5;
        System.out.println(predicate2.test("KK"));

        BiPredicate<String, Integer> biPredicate = (str1, num) -> str1.length() > num;
        System.out.println(biPredicate.test("Scaler", 5));
    }

    private static void demoConcreteExamples() {
        System.out.println("Hello World printed by " + Thread.currentThread().getName());

        Runnable runnable = () -> System.out.println("Hello World printed by " + Thread.currentThread().getName());
        Thread thread = new Thread(runnable);
        thread.start();

        // More optimised using lambda
        Thread thread2 = new Thread(() -> System.out.println("Hello World printed by " + Thread.currentThread().getName()));
        thread2.start();
    }

    private static void demoComparator() {

        List<Student> students = Arrays.asList(
                new Student("Prateek", 1, 50),
                new Student ("Karan", 2, 90),
                new Student("Rahul", 3, 70));

        Comparator<Student> marksComparator = (st1, st2) -> st1.marks - st2.marks;
        students.sort(marksComparator);
        System.out.println(students);
    }

}
