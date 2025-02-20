/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2_Minggu2;

import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class tgsno2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CAPE CERIA");
        System.out.println("ANEKA MINUMAN\n");
        System.out.println("SPECIAL MENU :");
        System.out.println("1. Soft drinks");
        System.out.println("2. Mix juice");
        System.out.println("3. Nescafe");
        System.out.println("4. Soda milk");
        System.out.println("5. Tea\n");

        System.out.print("Masukkan nama pembeli : ");
        String namaPembeli = sc.nextLine();

        System.out.print("Silahkan masukkan pilihan anda : ");
        int pilihan = sc.nextInt();

        System.out.println();

        switch (pilihan) {
            case 1:
                System.out.println("Minuman yang anda pesan adalah Soft drinks");
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah Soda milk");
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }

        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima Kasih " + namaPembeli + " telah berkunjung di Cafe Ceria");

        sc.close();
    }
}
    
