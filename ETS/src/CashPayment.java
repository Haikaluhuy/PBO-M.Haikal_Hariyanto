public class CashPayment extends PaymentService {
    @Override
    public String getPaymentMethod() {
        return "Cash";
    }

    @Override
    public String getPaymentStatus() {
        return "Pending";
    }
}
