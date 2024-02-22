package com.program;

public class cOperator {
    public static void main(String[] args) {
        // Operator
            // 1. Penegasan =

        int bilangan = 10;
        System.out.println(bilangan);

            // 2. Aritmatika +, -, *, /, % (mod), ++ (penambahan dengan 1), --, +=, -=

        int bil1 = 12,
            bil2 = 5,
            hasil = bil1 % bil2;
        System.out.println(hasil);

            // 3. Pembanding <, >, >=, <=, ==, !=

        int x = 12,
            y = 5;
        boolean tof = x < y;
        System.out.println(tof);

            // 4. Logika && (AND), || (OR), ! (NOT)

        int totalBayar = 150000;
        boolean shopingCard = false;
        boolean diskon = totalBayar >= 100000 && shopingCard == true;
        System.out.println(diskon);
    }
}
