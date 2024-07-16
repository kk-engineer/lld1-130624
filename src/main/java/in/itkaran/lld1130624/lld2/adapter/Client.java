package in.itkaran.lld1130624.lld2.adapter;

public class Client {
    public static void main(String[] args) {
        demoAdapter();
    }

    private static void demoAdapter() {
        BankApi bankApi = new IciciBankAdapter();
        PhonePe phonePe = new PhonePe(bankApi);
        String from = "158007775284";
        String to = "30198143653";
        int amount = 100000;
        phonePe.sendMoney(from, to, amount);
    }
}
