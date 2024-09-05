import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Konstanta gaji pokok dan harga per item
        final int GAJI_POKOK = 500000;
        final int HARGA_PER_ITEM = 50000;
        
        // Input jumlah item yang dijual
        System.out.print("Masukkan jumlah item yang terjual bulan ini: ");
        int jumlahItem = scanner.nextInt();
        
        // Hitung total penjualan berdasarkan jumlah item
        int totalPenjualan = jumlahItem * HARGA_PER_ITEM;
        double totalKompensasi = GAJI_POKOK;
        
        // Kondisi untuk menghitung bonus dan denda
        if (jumlahItem >= 40) {
            if (jumlahItem > 80) {
                // Bonus 35% jika penjualan lebih dari 80 item
                totalKompensasi += totalPenjualan * 0.35;
            } else {
                // Bonus 25% jika penjualan antara 40 hingga 80 item
                totalKompensasi += totalPenjualan * 0.25;
            }
        } else if (jumlahItem < 15) {
            // Hitung denda jika penjualan kurang dari 15 item
            int kekurangan = 15 - jumlahItem;
            double denda = kekurangan * HARGA_PER_ITEM * 0.15;
            totalKompensasi -= denda;
        }
        
        // Tambahkan bonus 10% jika penjualan antara 15 dan 40 item
        if (jumlahItem >= 15 && jumlahItem < 40) {
            totalKompensasi += totalPenjualan * 0.10;
        }
        
        // Tampilkan hasil akhir gaji
        System.out.println("Total kompensasi yang diterima: Rp " + (int) totalKompensasi);
        
        scanner.close();
    }
}
