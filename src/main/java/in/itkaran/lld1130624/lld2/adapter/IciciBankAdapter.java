package in.itkaran.lld1130624.lld2.adapter;

import in.itkaran.lld1130624.lld2.adapter.thirdparty.icicibank.IciciBank;

public class IciciBankAdapter implements BankApi {
    private final IciciBank iciciBank = new IciciBank();
    @Override
    public void sendMoney(String from, String to, int amount) {
        iciciBank.makePayment(amount, from, to);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public long checkBalance(String accountNumber) {
        return 0;
    }
}
