import java.util.Scanner;

public class task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input plat nomor mobil
        String platNomor = scanner.nextLine();

        // Pisahkan plat nomor
        String[] platList = platNomor.split(" ");

        // Gabungkan semua plat nomor menjadi satu angka besar
        StringBuilder gabunganAngka = new StringBuilder();
        for (String plat : platList) {
            gabunganAngka.append(plat);
        }

        // Ubah gabungan angka menjadi long
        long gabunganAngkaLong = Long.parseLong(gabunganAngka.toString());

        // Kurangkan dengan 999999
        long hasilKurang = gabunganAngkaLong - 999999;

        // Cek sisa bagi hasil bagi 5
        long sisaBagi = hasilKurang % 5;

        // Tentukan output berdasarkan sisa bagi
        if (sisaBagi == 0) {
            System.out.println("Jalan");
        } else {
            System.out.println("Berhenti");
        }
    }
}
