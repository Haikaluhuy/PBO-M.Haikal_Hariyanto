import java.util.Scanner;

public class task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String platNomor = scanner.nextLine();

        String[] platList = platNomor.split(" ");

        StringBuilder gabunganAngka = new StringBuilder();
        for (String plat : platList) {
            gabunganAngka.append(plat);
        }

        long gabunganAngkaLong = Long.parseLong(gabunganAngka.toString());

        long hasilKurang = gabunganAngkaLong - 999999;

        long sisaBagi = hasilKurang % 5;

        if (sisaBagi == 0) {
            System.out.println("Jalan");
        } else {
            System.out.println("Berhenti");
        }
    }
}
