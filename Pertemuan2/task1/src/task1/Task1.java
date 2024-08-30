/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Task1 {

    public static void main(String[] args) {
        System.out.printl n("Masukan angkanya=");
        Scanner sc = new Scanner(System.in);
        int t = 6;  // membaca jumlah kasus uji
        
        for (int i = 0; i < t; i++) {
            try {
                long n = sc.nextLong();  // membaca nilai input
                
                // Cek apakah nilai dapat disimpan dalam berbagai tipe data
                System.out.println(n + " dapat dimasukkan ke dalam:");
                
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                // Jika terjadi exception, berarti nilai terlalu besar untuk `long`
                System.out.println(sc.next() + " tidak dapat dimasukkan ke mana pun");
            }
        }
    }
    
}
