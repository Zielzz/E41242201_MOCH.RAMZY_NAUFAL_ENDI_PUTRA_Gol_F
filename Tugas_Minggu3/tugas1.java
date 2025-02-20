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
public class tugas1 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari user
        Scanner sc = new Scanner(System.in);

        // Meminta input angka pertama dan kedua dari user
        System.out.print("Masukan Angka Pertama : ");
        int angka1 = sc.nextInt();
        System.out.print("Masukan Angka Kedua : ");
        int angka2 = sc.nextInt();

        // Memastikan angka1 lebih kecil dari angka2
        if (angka1 > angka2) {
            System.out.println("Angka pertama harus lebih kecil dari angka kedua.");
            return; // Menghentikan program jika kondisi tidak terpenuhi
        }

        // Mencetak bilangan genap antara angka1 dan angka2
        for (int i = angka1; i <= angka2; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }

        // Menutup Scanner
        sc.close();
    }
}
