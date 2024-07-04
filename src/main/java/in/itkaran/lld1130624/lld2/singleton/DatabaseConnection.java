package in.itkaran.lld1130624.lld2.singleton;

public class DatabaseConnection {
    private static DatabaseConnection instance = null;
    private String url;
    private String username;
    private String password;

    private DatabaseConnection() {
        // Make constructor private - so that object cannot be created
    }
    public static DatabaseConnection getInstance() {
        System.out.println("Check if instance is available " + Thread.currentThread().getName());
        if (instance == null) {
            System.out.println("Instance NOT available " + Thread.currentThread().getName());
            synchronized (DatabaseConnection.class) {
                System.out.println("Double check lock " + Thread.currentThread().getName());
                if (instance == null) {
                    System.out.println("Creating Singleton instance " + Thread.currentThread().getName());
                    instance = new DatabaseConnection();
                }
            }
        }
        System.out.println("Returning Singleton instance " + Thread.currentThread().getName());
        return instance;
    }
}
