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
public class tgsno1 {
    
    public static double harga1, harga2, harga3, harga4, harga5, total;
    public static String nama;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nama anda: ");
        nama = sc.nextLine();
        System.out.print("Masukan harga barang 1 = ");
        harga1 = sc.nextDouble();
        System.out.print("Masukan harga barang 2 = ");
        harga2 = sc.nextDouble();
        System.out.print("Masukan harga barang 3 = ");
        harga3 = sc.nextDouble();
        System.out.print("Masukan harga barang 4 = ");
        harga4 = sc.nextDouble();
        System.out.print("Masukan harga barang 5 = ");
        harga5 = sc.nextDouble();
        
        total = harga1 + harga2 + harga3 + harga4 + harga5;
        
        System.out.println("\n"
                + "         Kharisma Agung Plaza < KAP >" + "\n" +
                "           Promo Belanja Berhadiah" + "\n" +
                "       Khusus Pembelian 5 Barang Pertama" + "\n" +
                "           Dengan Harga Minimum Rp 1000.00" + "\n" +
                "-------------------------------------------------" + "\n" + "\n" +
                "Masukan harga barang ke-1 : " + harga1 + "\n" +
                "Masukan harga barang ke-2 : " + harga2 + "\n" +
                "Masukan harga barang ke-3 : " + harga3 + "\n" +
                "Masukan harga barang ke-4 : " + harga4 + "\n" +
                "Masukan harga barang ke-5 : " + harga5 + "\n" +
                "Total harga pembelian atas nama " + nama + " adalah Rp " + total + "\n" + "\n" +
                "Selamat....\n");
                
                if(harga1 >=10000 && harga2 >=10000 && harga3 >= 10000 && harga4 >=10000 && harga5 >=10000)
                System.out.println("Anda mendapat 1 buah mug cantik");
                System.out.println("------------------------------------------------" + "\n" +
                "                Terimakasih" + "\n" +
                "Anda sudah belanja di Kharisma Agung Plaza\n");
                
    }   
}
