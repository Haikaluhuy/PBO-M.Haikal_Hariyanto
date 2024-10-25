package Case1;
import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);

        // Mendapatkan kata dari pengguna
        System.out.print("Masukkan satu kata (hanya huruf): ");
        String word = scan.nextLine();

        // Mengubah semua huruf menjadi huruf besar
        word = word.toUpperCase();

        // Menghitung frekuensi setiap huruf dalam string
        for (int i = 0; i < word.length(); i++) {
            try {
                counts[word.charAt(i) - 'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                // Menampilkan pesan ketika karakter non-huruf ditemukan
                System.out.println("Bukan huruf: " + word.charAt(i));
            }
        }
        
        System.out.println("Jumlah Huruf ");

        // Mencetak frekuensi huruf
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
            }
        }
    }
}
