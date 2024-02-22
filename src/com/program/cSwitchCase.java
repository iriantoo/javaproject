package com.program;

import java.util.Scanner;

public class cSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float bil1 = 0, bil2 = 0, hasil = 0;

        System.out.print("=== Program Kalkulator Sederhana ===\n" 
        + "1. Pertambahan (+)\n" 
        + "2. Pengurangan (-)\n" 
        + "3. Perkalian (*)\n" 
        + "4. Pembagian (/)\n" 
        + "Masukkan Pilihan Anda [1/2/3/4] : ");
        char pilihan = input.next().charAt(0);

        switch (pilihan) {
            case '1':
                System.out.print("Masukkan Bilangan 1: ");
                bil1 = input.nextFloat();
                System.out.print("Masukkan Bilangan 2: ");
                bil2 = input.nextFloat();
                hasil = bil1 + bil2;
                System.out.print("Hasil " + bil1 + " + " + bil2 + " : " + hasil);
                break;

            case '2':
                System.out.print("Masukkan Bilangan 1: ");
                bil1 = input.nextFloat();
                System.out.print("Masukkan Bilangan 2: ");
                bil2 = input.nextFloat();
                hasil = bil1 - bil2;
                System.out.print("Hasil " + bil1 + " - " + bil2 + " : " + hasil);
                break;

            case '3':
                System.out.print("Masukkan Bilangan 1: ");
                bil1 = input.nextFloat();
                System.out.print("Masukkan Bilangan 2: ");
                bil2 = input.nextFloat();
                hasil = bil1 * bil2;
                System.out.print("Hasil " + bil1 + " * " + bil2 + " : " + hasil);
                break;

            case '4':
                System.out.print("Masukkan Bilangan 1: ");
                bil1 = input.nextFloat();
                System.out.print("Masukkan Bilangan 2: ");
                bil2 = input.nextFloat();
                hasil = bil1 - bil2;
                System.out.print("Hasil " + bil1 + " / " + bil2 + " : " + hasil);                    
                break;

            default:
                System.out.println("Pilihan Anda Salah!");
                return;
        }
        input.close();
    }
}
