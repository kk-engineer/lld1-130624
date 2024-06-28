package in.itkaran.lld1130624.lld1class10.generics;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        //demoPair();
        //demoGenericPair();
        //demoRawDataTypes();
        //demoTypeErasure();
        demoGenericMethod();
    }

    private static void demoPair() {
        Pair p1 = new Pair();
        p1.first = 20.456;
        p1.second = "82.567";

        double x = (double)p1.first;
        //double y = (double)p1.second;   // Runtime error
        //System.out.println(x);
        //System.out.println(y);
    }

    private static void demoGenericPair() {
        GenericPair<String, Integer> p2 = new GenericPair<>();
        p2.setFirst("India");
        p2.setSecond(1400000000);

        System.out.println(p2.getFirst());
        System.out.println(p2.getSecond());

        GenericPair<Double, Double> p3 = new GenericPair<>();
        p3.setFirst(3.456);
        p3.setSecond(12.34);
        System.out.println(p3.getFirst());
        System.out.println(p3.getSecond());
    }

    private static void demoRawDataTypes() {
        HashMap map = new HashMap();
        map.put("India", 140);
        // No compile time safety
        map.put("USA", "UK");
        System.out.println(map.get("India"));
        System.out.println(map.get("USA"));

        // After Java 5 - Generics provided compile time safety.
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("India", 140);
        // Below will give compile time error
        //map2.put("USA", "UK");
    }

    private static void demoTypeErasure() {
        List<String> strings = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        // Make a break point here and check the list created
        // all the lists will not have any type, such as, string, integer etc
        System.out.println("Debug");

        Set<Integer> set = new HashSet<>();
    }

    private static void demoGenericMethod() {
        GenericPair.fun("Hello");
        GenericPair.fun(2);
        GenericPair.fun(5.0);
    }
}
