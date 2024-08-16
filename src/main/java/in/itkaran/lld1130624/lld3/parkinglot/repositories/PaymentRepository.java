package in.itkaran.lld1130624.lld3.parkinglot.repositories;

import in.itkaran.lld1130624.lld3.parkinglot.models.Payment;

import java.util.Map;
import java.util.TreeMap;

public class PaymentRepository {
    private Map<Long, Payment> paymentMap = new TreeMap<>();
    private Long previousPaymentId = 0L;

    public Payment save(Payment payment) {
        if (payment.getId() == null) {
            previousPaymentId += 1;
            payment.setId(previousPaymentId);
        }
        paymentMap.put(payment.getId(), payment);
        return payment;
    }

    public Payment findPaymentById(Long paymentId) {
        return paymentMap.get(paymentId);
    }
}
