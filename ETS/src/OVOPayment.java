public class OVOPayment extends PaymentService {
    @Override
    public String getPaymentMethod() {
        return "OVO";
    }

    @Override
    public String getPaymentStatus() {
        return "Successful";
    }
}
