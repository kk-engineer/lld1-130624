package in.itkaran.lld1130624.lld2.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        //demoSingleton();
        demoMultithreaded();
    }

    private static void demoSingleton() {
        // calling constructor will not work
        //DatabaseConnection databaseConnection = new DatabaseConnection();
        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();

        // create a debug point below and check that
        // both the objects have same address
        System.out.println("DEBUG");
    }

    private static void demoMultithreaded()  {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            SingletonObjectCreator singletonObjectCreator = new SingletonObjectCreator();
            executor.execute(singletonObjectCreator);
        }
        executor.shutdown();
    }
}
