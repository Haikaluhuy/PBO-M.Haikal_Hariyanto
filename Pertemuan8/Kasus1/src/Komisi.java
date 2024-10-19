public class Komisi extends PekerjaLepas {
    private double totalSales;
    private double commissionRate;

    public Komisi(String name, String address, String phone, String socialSecurityNumber, double payRate, double commissionRate) {
        super(name, address, phone, socialSecurityNumber, payRate);
        this.commissionRate = commissionRate;
        this.totalSales = 0;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double gajian() {
        double basePay = super.gajian(); // Gaji berdasarkan jam kerja
        double commissionPay = totalSales * commissionRate; // Gaji dari komisi
        totalSales = 0; // Reset total sales setelah menghitung gaji
        return basePay + commissionPay;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: " + totalSales;
    }
}
