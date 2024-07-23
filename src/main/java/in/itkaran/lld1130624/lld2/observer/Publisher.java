package in.itkaran.lld1130624.lld2.observer;

public interface Publisher {
    void register(Subscriber subscriber);
    void deregister(Subscriber subscriber);
    void notifySubscribers();
}
