package in.itkaran.lld1130624.lld2.adapter.adapters;

import in.itkaran.lld1130624.lld2.adapter.thirdparty.yesbank.YesBank;

public class YesBankAdapter implements BankApi {
    private final YesBank yesBank = new YesBank();

    @Override
    public void sendMoney(String from, String to, int amount) {
        yesBank.transferMoney(from, to, amount);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public long checkBalance(String accountNumber) {
        return 0;
    }
}
