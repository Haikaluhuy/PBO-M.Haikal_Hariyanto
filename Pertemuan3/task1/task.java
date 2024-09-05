import java.util.Scanner;
import java.util.regex.*;
import java.util.*;

public class task {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input string dari pengguna
        System.out.println("Masukkan string:");
        String s = scanner.nextLine();
        
        // Menutup scanner setelah selesai digunakan
        scanner.close();
        
        // Membuat objek Pattern dengan regex untuk token alfabet
        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Matcher matcher = pattern.matcher(s);
        
        // Menggunakan list untuk menyimpan token
        List<String> tokens = new ArrayList<>();
        
        // Menemukan semua token yang cocok
        while (matcher.find()) {
            tokens.add(matcher.group());
        }
        
        // Mencetak jumlah token
        System.out.println(tokens.size());
        
        // Mencetak setiap token di baris baru
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}

