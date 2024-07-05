package in.itkaran.lld1130624.lld1class10.generics;

import java.util.List;

public class GenericPair<F, S> {
    private F first;
    private S second;

    public void setFirst(F first) {
        this.first = first;
    }
    public void setSecond(S second) {
        this.second = second;
    }

    public F getFirst() {
        return first;
    }
    public S getSecond() {
        return second;
    }

    // Generic static method
    public static <T> void fun(T data) {
        System.out.println(data);
    }

    // Generic method
    public <K> void fun2(K key) {
        System.out.println(key);
    }
}
