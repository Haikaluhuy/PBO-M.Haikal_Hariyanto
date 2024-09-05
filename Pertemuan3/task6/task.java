import java.math.BigInteger;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca dua baris input
        String inputA = scanner.nextLine();
        String inputB = scanner.nextLine();

        // Mengonversi string input menjadi BigInteger
        BigInteger a = new BigInteger(inputA);
        BigInteger b = new BigInteger(inputB);

        // Melakukan penjumlahan
        BigInteger sum = a.add(b);
        // Melakukan perkalian
        BigInteger product = a.multiply(b);

        // Mencetak hasil penjumlahan
        System.out.println(sum);
        // Mencetak hasil perkalian
        System.out.println(product);

        scanner.close();
    }
}
