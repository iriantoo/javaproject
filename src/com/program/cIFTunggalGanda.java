package com.program;

public class cIFTunggalGanda {
    public static void main(String[] args) {
        int nilai = 50;
        if (nilai >= 70) {
            System.out.println("Anda Lulus!");
        } else {
            System.out.println("Anda Tidak Lulus!");
        }

        // equals pembanding untuk string (memperhatikan huruf besar/kecil)
        String password = "SteIgO6928";
        if (password.equals("SteIgO6928")) {
            System.out.println("Password Benar!");
        } else {
            System.out.println("Password Salah!");
        }

        // equalsIgnoreCase pembanding string tidak memperdulikan besar/kecil huruf
        String nama = "IrIaNTo";
        if (nama.equalsIgnoreCase("Irianto")) {
            System.out.println("Ya kamu adalah Irianto!");
        } else {
            System.out.println("Anda Bukan Irianto!");
        }
    }
}
