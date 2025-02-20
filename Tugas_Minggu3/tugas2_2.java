package Tugas_Minggu3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class tugas2_2 {
     
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Masukkan jumlah deret: ");
        int jumlahDeret = sc.nextInt();

        int[] deretAcak = new int[jumlahDeret];

        for (int i = 0; i < jumlahDeret; i++) {
            deretAcak[i] = random.nextInt(100); 
        }

        System.out.println("Deretan array acak:");
        for (int i = 0; i < jumlahDeret; i++) {
            System.out.print(deretAcak[i] + " ");
        }
    }
    
}
