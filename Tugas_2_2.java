/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_2_2;

import java.util.Scanner;

/**
 *
 * @author Azrynn
 */
public class Tugas_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        int jam, menit, detik, totaldet;

        System.out.print("Masukkan jam: ");
        jam = input.nextInt();  
        
        System.out.print("Masukkan menit: ");
        menit = input.nextInt();
        
        System.out.print("Masukkan detik: ");
        detik = input.nextInt();

        totaldet = (jam * 3600) + (menit * 60) + detik;

        System.out.println("Total detik = " + totaldet);
    }
    
}
