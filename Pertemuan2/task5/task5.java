import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan=");
        // Input string A dan B
        String A = sc.next();
        String B = sc.next();
        
        // 1. Jumlah panjang A dan B
        int jumlahPanjang = A.length() + B.length();
        System.out.println(jumlahPanjang);
        
        // 2. Perbandingan leksikografis
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        // 3. Kapitalisasi huruf pertama dari A dan B
        String kapitalA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String kapitalB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(kapitalA + " " + kapitalB);
        
        sc.close();
    }
}
