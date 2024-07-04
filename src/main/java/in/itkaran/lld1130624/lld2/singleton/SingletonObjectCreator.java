package in.itkaran.lld1130624.lld2.singleton;

public class SingletonObjectCreator implements Runnable{

    public void run() {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
    }
}
