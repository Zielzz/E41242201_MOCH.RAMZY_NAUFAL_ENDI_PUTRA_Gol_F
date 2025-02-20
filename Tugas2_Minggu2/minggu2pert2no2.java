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
public class minggu2pert2no2 {
    
    public static void main(String[] args) {
         String lampu;
         Scanner scan = new Scanner(System.in);
         
         System.out.println("Inputkan nama warna");
         lampu = scan.nextLine();
         
         switch (lampu) {
            case "biru":
                System.out.println("Lampu biru, berhenti");
                break;
            case "ungu":
                System.out.println("Lampu ungu, harap berhati hati");
            case "pink":
                System.out.println("Lampu pink, silahkan jalan");
            default:
                System.out.println("Warna lampu salah!");
         }
    }
    
}
