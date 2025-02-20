/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Minggu3;

    import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class tes {
    
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari user
        Scanner scanner = new Scanner(System.in);

        // Meminta input tinggi segitiga dari user
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = scanner.nextInt();

        // Membuat segitiga terbalik
        for (int i = tinggi; i >= 1; i--) {
            // Membuat spasi untuk merapikan segitiga
            for (int j = 0; j < tinggi - i; j++) {
                System.out.print(" ");
            }

            // Mencetak bintang (*) untuk membentuk segitiga
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Pindah ke baris baru setelah satu baris selesai
            System.out.println();
        }

        // Menutup Scanner
        scanner.close();
    }
}
    

