package in.itkaran.lld1130624.lld2.adapter;

import in.itkaran.lld1130624.lld2.adapter.adapters.BankApi;

public class PhonePe {
    private BankApi bankApi;

    public PhonePe(BankApi bankApi) {
        this.bankApi = bankApi;
    }

    public void sendMoney(String from, String to, int amount) {
        bankApi.sendMoney(from, to, amount);
    }
}
