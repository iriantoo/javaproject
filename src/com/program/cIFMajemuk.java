package com.program;
import java.util.Scanner;

public class cIFMajemuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gaji_lembur_per_jam = 5000, gaji_per_jam = 0, gaji_jam_kerja_normal = 0, gaji_lembur = 0, total_gaji = 0, jam_lembur = 0, jam_kerja_normal = 0;

        System.out.print("Nama Karyawan       : ");
        String nama = input.nextLine();
        System.out.print("Golongan [A/B/C/D]  : ");
        char golongan = input.next().charAt(0);

        if (golongan == 'A') {
            gaji_per_jam = 7000;
        } else if (golongan == 'B') {
            gaji_per_jam = 9000;
        } else if (golongan == 'C') {
            gaji_per_jam = 12000;
        } else if (golongan == 'D') {
            gaji_per_jam = 15000;
        } else {
            System.out.println("Anda salah memasukkan golongan!");
            return;
        }

        System.out.print("Jumlah Jam Kerja    : ");
        int jumlah_jam_kerja = input.nextInt();

        if (jumlah_jam_kerja > 42) {
            jam_lembur = jumlah_jam_kerja - 42;
            gaji_jam_kerja_normal = 42 * gaji_per_jam;
            gaji_lembur = jam_lembur * gaji_lembur_per_jam;
            jam_kerja_normal = jumlah_jam_kerja - jam_lembur;
            total_gaji = gaji_jam_kerja_normal + gaji_lembur;
        } else {
            gaji_jam_kerja_normal = jumlah_jam_kerja * gaji_per_jam;
            gaji_lembur = 0;
            jam_kerja_normal = jumlah_jam_kerja;
            jam_lembur = 0;
            total_gaji = gaji_jam_kerja_normal + gaji_lembur;
        }

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Nama Karyawan           : " + nama);
        System.out.println("Golongan                : " + golongan + " dengan gaji sebesar Rp " + gaji_per_jam + "/jam");
        System.out.println("Jumlah Jam Kerja        : " + jumlah_jam_kerja + " jam");
        System.out.println("Jumlah Jam Kerja Normal : " + jam_kerja_normal + " jam");
        System.out.println("Gaji Jam Kerja Normal   : Rp " + gaji_jam_kerja_normal);
        System.out.println("Jumlah Jam Kerja Lembur : " + jam_lembur + " jam");
        System.out.println("Gaji Lembur             : Rp " + gaji_lembur + " dengan gaji lembur Rp " + gaji_lembur_per_jam + "/jam");
        System.out.println("Total Gaji              : Rp " + total_gaji);
        System.out.println("----------------------------------------------------------------------");
        input.close();
    }
}
