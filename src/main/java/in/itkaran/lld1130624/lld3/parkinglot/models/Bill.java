package in.itkaran.lld1130624.lld3.parkinglot.models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel {
    private Ticket ticket;
    private Gate gate;
    private Operator generatedBy;
    private BillStatus billStatus;
    private Date exitTime;
    private int amount;
    private List<Payment> payments;
    private FeeCalculationStrategyType feeCalculationStrategyType;
}
