/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p2_pbojava_fredi_irawan;

/**
 *
 * @author Fredi Irawan
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Buat 2 integer variabel dengan nama nilaiA dan nilaiB dengan inisialisasi nilai masing-masing 10 dan 20
        int nilaiA = 10, nilaiB = 20;

        // Buat 2 variabel dengan tipe double dengan nama dan nilai sekehendak anda.
        double nilaiC = 1.5, nilaiD = 2.7;

        // Buat satu boolean variabel dengan nama isPlus
        boolean isPlus = true;

        // Tampilkan masing-masing variabel dengan println().
        System.out.println("nilaiA = " + nilaiA);
        System.out.println("nilaiB = " + nilaiB);
        System.out.println("nilaiC = " + nilaiC);
        System.out.println("nilaiD = " + nilaiD);
        System.out.println("isPlus = " + isPlus);

        // Buat input untuk disimpan dalam variabel tipe integer, double dan boolean di atas dengan nilai baru.
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai baru untuk nilaiA: ");
        nilaiA = input.nextInt();
        System.out.print("Masukkan nilai baru untuk nilaiC: ");
        nilaiC = input.nextDouble();
        System.out.print("Masukkan nilai baru untuk isPlus (true/false): ");
        isPlus = input.nextBoolean();

        // Tampilkan kembali dengan perintah println
        System.out.println("nilaiA = " + nilaiA);
        System.out.println("nilaiC = " + nilaiC);
        System.out.println("isPlus = " + isPlus);

        // Buat lagi variabel bernilai String lalu gunakan input untuk memberi nilai variabel tersebut dan tampilkan pada layar.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah kalimat: ");
        String inputString = scanner.nextLine();
        System.out.println("Kalimat yang anda masukkan adalah: " + inputString);
     }
}
