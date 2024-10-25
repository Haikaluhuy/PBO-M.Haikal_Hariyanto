import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);

        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            System.out.print("Masukkan sebuah bilangan bulat: ");
            int val = scan.nextInt();

            // Memproses faktorial dalam blok try-catch
            try {
                System.out.println("Faktorial dari " + val + " adalah " + MathUtils.factorial(val));
            } catch (IllegalArgumentException e) {
                // Menangkap pengecualian dan menampilkan pesan
                System.out.println(e.getMessage());
            }

            System.out.print("Ingin menghitung faktorial lain? (y/n): ");
            keepGoing = scan.next();
        }
    }
}
