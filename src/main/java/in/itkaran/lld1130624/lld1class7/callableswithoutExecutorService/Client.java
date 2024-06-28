package in.itkaran.lld1130624.lld1class7.callableswithoutExecutorService;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(7,4,6,5,8,1,9,3,2);
        //ExecutorService executor = Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(list);
        List<Integer> sortedList = mergeSorter.call();
        //Future<List<Integer>> sortedList = executor.submit(mergeSorter);
        System.out.println(sortedList);
        //executor.shutdown();
    }
}
