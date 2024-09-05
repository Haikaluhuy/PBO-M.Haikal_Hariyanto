import java.util.Scanner;

public class task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Arrays untuk menyimpan string dan integer input
        String[] inputStrings = new String[3];
        int[] inputInts = new int[3];
        
        // Print the top border
        System.out.println("================================");

        // Input data sebanyak 3 kali (string dan angka di satu baris)
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan string dan angka (pisahkan dengan spasi):");
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            
            // Validasi input
            if (parts.length != 2) {
                System.out.println("Input tidak valid. Pastikan memasukkan string dan angka yang dipisahkan dengan spasi.");
                i--; // Ulangi input jika tidak valid
                continue;
            }

            inputStrings[i] = parts[0];
            try {
                inputInts[i] = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Angka tidak valid. Masukkan angka dalam format yang benar.");
                i--; // Ulangi input jika angka tidak valid
            }
        }
        
        // Print the bottom border setelah input selesai
        System.out.println("================================");

        // Output hasil yang diinput sebelumnya
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s%03d%n", inputStrings[i], inputInts[i]);
        }

        // Print the bottom border setelah output selesai
        System.out.println("================================");

        scanner.close();
    }
}
