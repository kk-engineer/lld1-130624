package in.itkaran.lld1130624.lld1class7.callables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(7,4,6,5,8,1,9,3,2);
        // Multithreading
        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(list, executorService);
        // We will get a future
        //List<Integer> sortedListFuture = mergeSorter.call();
        Future<List<Integer>> sortedListFuture = executorService.submit(mergeSorter);

        // Get the sorted list from future
        // This get() is a blocking call - wait on future to return the value.
        List<Integer> sortedList = sortedListFuture.get();
        System.out.println(sortedList);
        executorService.shutdown();
    }
}
