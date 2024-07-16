package in.itkaran.lld1130624.lld2.adapter;

public interface BankApi {

    void sendMoney(String from, String to, int amount);
    void registerAccount(String accountNumber);
    long checkBalance(String accountNumber);
}
