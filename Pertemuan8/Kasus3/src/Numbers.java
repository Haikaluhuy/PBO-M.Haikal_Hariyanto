import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of integers to sort:");
        int numItems = scan.nextInt();
        Integer[] numbers = new Integer[numItems];  // Menggunakan Integer[] untuk autoboxing

        System.out.println("Enter the numbers:");
        for (int i = 0; i < numItems; i++) {
            numbers[i] = scan.nextInt();
        }

        // Sorting using insertionSort in descending order
        Sorting.insertionSort(numbers);

        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}