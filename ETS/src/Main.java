

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    private static final String JSON_FILE = "delivery_data.json";

    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            Delivery[] deliveries = gson.fromJson(new FileReader(JSON_FILE), Delivery[].class);

            System.out.println("productName | quantity | weight | destination | servicePackage | serviceValue | Total | paymentMethod | paymentStatus");
            System.out.println("------------|----------|--------|-------------|----------------|--------------|-------|---------------|---------------");

            for (Delivery delivery : deliveries) {
                int total = delivery.getPriceItem() * delivery.getQuantity() + delivery.getServicePackage().getValue();
                PaymentService paymentService = getRandomPaymentService();

                System.out.printf("%-12s | %-8d | %-6d | %-11s | %-14s | %-12d | %-5d | %-13s | %s%n",
                    delivery.getProductName(),
                    delivery.getQuantity(),
                    delivery.getWeight(),
                    delivery.getCity().getDestination(),
                    delivery.getServicePackage().getService(),
                    delivery.getServicePackage().getValue(),
                    total,
                    paymentService.getPaymentMethod(),
                    paymentService.getPaymentStatus()
                );
            }
        } catch (JsonIOException | JsonSyntaxException | IOException e) {
            e.printStackTrace();
        }
    }

    private static PaymentService getRandomPaymentService() {
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0: return new OVOPayment();
            case 1: return new QRISPayment();
            default: return new CashPayment();
        }
    }
}
