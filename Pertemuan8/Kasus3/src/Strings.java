import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of strings to sort:");
        int numItems = scan.nextInt();
        String[] strings = new String[numItems];

        System.out.println("Enter the strings:");
        for (int i = 0; i < numItems; i++) {
            strings[i] = scan.next();
        }

        // Sorting using insertionSort in descending order
        Sorting.insertionSort(strings);

        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.print(str + " ");
        }
    }
}