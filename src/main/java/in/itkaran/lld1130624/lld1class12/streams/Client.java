package in.itkaran.lld1130624.lld1class12.streams;

import in.itkaran.lld1130624.lld1class12.lambdas.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        //demoStreamCreation();
        demoStreamFunction();
    }

    private static void demoStreamCreation() {
        List<Integer> nums = Arrays.asList(2, 3, 1, 7, 6, 4, 5);
        // 1. using list
        Stream<Integer> stream1 = nums.stream();

        // 2. Directly create a stream
        Stream<Integer> stream2 = Stream.of(2, 3, 1, 7, 6, 4, 5);

        // 3. Stream - Builder design pattern
        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(1);
        streamBuilder.add(2);
        streamBuilder.add(3);
        streamBuilder.add(4);
        streamBuilder.add(5);
        streamBuilder.build();
    }

    private static void demoStreamFunction() {
        // Q.1 Odd numbers
        List<Integer> nums = Arrays.asList(2, 3, 1, 7, 6, 4, 5);
        Stream<Integer> stream1 = nums.stream().filter(num -> num % 2 == 1);
        List<Integer> nums2 = stream1.toList();
        System.out.println(nums2);

        // One line
        List<Integer> nums3 = nums.stream().filter(num -> num % 2 == 1).toList();
        System.out.println(nums3);

        // Q2. Print students with marks > 80
        List<Student> students = Arrays.asList(
                new Student("Prateek", 1, 50),
                new Student ("Karan", 2, 90),
                new Student("Rahul", 3, 70));

        System.out.println(students.stream().filter((student) -> student.marks > 80).toList());

        // Q.3 Map students to marks
        System.out.println(students.stream().map((student) -> student.marks).toList());
        // no need of bracket around student - more simplified
        System.out.println(students.stream().map(student -> student.marks).toList());

        // Q.4 Count number of strings with length > 5
        List<String> words = Arrays.asList("Prateek", "Karan", "Rahul", "Scaler", "LLD", "Class");
        System.out.println(words.stream().filter((word) -> word.length() > 5).count());

        // Q.5 Convert a list of words to upper case
        System.out.println(words.stream().map(word -> word.toUpperCase()).toList());
        System.out.println(words.stream().map(String::toUpperCase).toList());

        // Q.6 : Flatmap - HW
        List<String> words2 = Arrays.asList("Hello", "World", "iPad", "MacBook Pro", "iPhone");
        List<List<String>> words2D = Arrays.asList(words, words2);

        System.out.println(words2D);
        System.out.println(words2D.stream().flatMap(List::stream).map(String::toUpperCase).toList());
    }

}
