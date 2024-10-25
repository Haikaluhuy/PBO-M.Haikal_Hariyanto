import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan sebuah baris teks:");
        Scanner scanLine = new Scanner(scan.nextLine());

        // Blok try-catch di dalam perulangan while
        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (NumberFormatException e) {
                // Abaikan token non-angka
            }
        }

        System.out.println("Jumlah dari bilangan bulat pada baris ini adalah " + sum);
    }
}
