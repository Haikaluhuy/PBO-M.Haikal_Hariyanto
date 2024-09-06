import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        final int GAJI_POKOK = 500000;
        final int HARGA_PER_ITEM = 50000;
        

        System.out.print("Masukkan jumlah item yang terjual bulan ini: ");
        int jumlahItem = scanner.nextInt();
        

        int totalPenjualan = jumlahItem * HARGA_PER_ITEM;
        double totalKompensasi = GAJI_POKOK;
        

        if (jumlahItem >= 40) {
            if (jumlahItem > 80) {

                totalKompensasi += totalPenjualan * 0.35;
            } else {

                totalKompensasi += totalPenjualan * 0.25;
            }
        } else if (jumlahItem < 15) {

            int kekurangan = 15 - jumlahItem;
            double denda = kekurangan * HARGA_PER_ITEM * 0.15;
            totalKompensasi -= denda;
        }
        

        if (jumlahItem >= 15 && jumlahItem < 40) {
            totalKompensasi += totalPenjualan * 0.10;
        }
        

        System.out.println("Total kompensasi yang diterima: Rp " + (int) totalKompensasi);
        
        scanner.close();
    }
}
