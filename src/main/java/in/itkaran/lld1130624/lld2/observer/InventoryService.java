package in.itkaran.lld1130624.lld2.observer;


public class InventoryService implements Subscriber {
    @Override
    public void update() {
        System.out.println("Updating inventory status");
    }
}
