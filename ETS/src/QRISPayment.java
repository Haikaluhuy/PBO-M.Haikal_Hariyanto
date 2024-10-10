public class QRISPayment extends PaymentService {
    @Override
    public String getPaymentMethod() {
        return "QRIS";
    }

    @Override
    public String getPaymentStatus() {
        return "Successful";
    }
}
