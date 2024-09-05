import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        System.out.println("masukan Operasi");
        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        // Memisahkan input berdasarkan spasi
        String[] parts = input.split(" ");
        int A = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int B = Integer.parseInt(parts[2]);
        
        // Variabel untuk menyimpan hasil
        int result = 0;
        
        // Melakukan operasi sesuai dengan operator
        switch (operator) {
            case "+":
                result = A + B;
                break;
            case "-":
                result = A - B;
                break;
            case "*":
                result = A * B;
                break;
            case "/":
                result = A / B;
                break;
            case "%":
                result = A % B;
                break;
            default:
                // Jika operator tidak valid, bisa menambahkan penanganan error
                System.out.println("Operator tidak valid");
                return;
        }
        
        // Menampilkan hasil
        System.out.println(result);
    }
}
