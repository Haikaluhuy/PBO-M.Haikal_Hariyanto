import java.math.BigInteger;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputA = scanner.nextLine();
        String inputB = scanner.nextLine();

        BigInteger a = new BigInteger(inputA);
        BigInteger b = new BigInteger(inputB);

        BigInteger sum = a.add(b);

        BigInteger product = a.multiply(b);


        System.out.println(sum);

        System.out.println(product);

        scanner.close();
    }
}
