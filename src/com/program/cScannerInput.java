package com.program;
import java.util.Scanner;

public class cScannerInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Nilai Akhir: ");
        int nilai = input.nextInt();

        if (nilai >= 75) {
            System.out.println("Mahasiswa atas nama " + nama + " dinyatakan lulus! Dengan nilai: " + nilai);
        } else {
            System.out.println("Mahasiswa atas nama " + nama + " dinyatakan tidak lulus! Dengan nilai: " + nilai);
        }
        input.close();
    }
}
