package in.itkaran.lld1130624.lld2.adapter.thirdparty.icicibank;

public class IciciBank {

    public void makePayment(int amount, String to, String from) {
        System.out.println("ICICI Bank: Transferred money " + amount/100 + " to account " + to + " from account " + from);
    }
}
