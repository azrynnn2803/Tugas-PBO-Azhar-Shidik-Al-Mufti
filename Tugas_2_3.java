/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_2_3;

import java.util.Scanner;

/**
 *
 * @author Azrynn
 */
public class Tugas_2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
        
        float jari, keliling, luas;
        final float PI = 3.14f;

        System.out.print("Masukkan jari-jari: ");
        jari = input.nextFloat();  

        luas = PI * jari * jari;
        keliling = 2 * PI * jari;

        System.out.println("Luas = " + luas);
        System.out.println("Keliling = " + keliling);    }
    
}
