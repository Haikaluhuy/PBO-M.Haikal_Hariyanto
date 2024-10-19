import java.util.Scanner;
import java.util.Arrays;

public class WeeklySales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of salespeople:");
        int numPeople = scan.nextInt();
        Salesperson[] staff = new Salesperson[numPeople];

        for (int i = 0; i < numPeople; i++) {
            System.out.println("Enter first name, last name, and total sales for salesperson " + (i + 1) + ":");
            String firstName = scan.next();
            String lastName = scan.next();
            int totalSales = scan.nextInt();
            staff[i] = new Salesperson(firstName, lastName, totalSales);
        }

        Arrays.sort(staff);  // Sorting menggunakan compareTo

        System.out.println("Sorted Salespeople:");
        for (Salesperson sp : staff) {
            System.out.println(sp);
        }
    }
}