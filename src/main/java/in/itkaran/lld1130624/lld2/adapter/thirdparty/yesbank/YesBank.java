package in.itkaran.lld1130624.lld2.adapter.thirdparty.yesbank;

public class YesBank {

    public void transferMoney(String from, String to, int amount) {
        System.out.println("YES Bank: Transferred money " + amount/100 + " from account " + from + " to account " + to);
    }
}
