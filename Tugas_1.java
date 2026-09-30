/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_1;

import java.util.Scanner;

/**
 *
 * @author Azrynn
 */
public class Tugas_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tahun;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Tahun (1909 - 2024: ");
        tahun = input.nextInt();
        
        if((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println(tahun + " adalah tahun kabisat");
        }else{
            System.out.println(tahun + " adalah bukan tahun kabisat");
        }
    }
}
