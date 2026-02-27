package org.uts.TestRunner;

import org.uts.*;

public class TestRunner {

    public static void main(String[] args) {

        int passed = 0;
        int total = 0;

        System.out.println("\n=== TEST RUNNER TICKETING BIOSKOP ===\n");

        // =========================
        // TEST 1 - Validasi ID
        // =========================
        total++;
        try {
            Film film1 = new Film("Merah Putih One For All", 70);
            Film film2 = new Film("Demon Slayer: Infinity Castle", 155);
            Film film3 = new Film("Spider-Man No Way Home", 157);

            Tiket t1 = new TiketReguler("MOFA-2026-0001", film1);
            Tiket t2 = new TiketReguler("DSIC-2026-0001", film2);
            Tiket t3 = new TiketReguler("SNWH-2026-0001", film3);

            System.out.println("Test 1 (Valid ID) : PASS");
            passed++;
        } catch (Exception e) {
            System.out.println("Test 1 (Valid ID) : FAIL");
        }

        // =========================
        // TEST 2 - Invalid ID
        // =========================
        total++;
        try {
            Film film = new Film("Demon Slayer: Infinity Castle", 155);
            Tiket t = new TiketReguler("SALAH", film);
            System.out.println("Test 2 (Invalid ID) : FAIL");
        } catch (IllegalArgumentException e) {
            System.out.println("Test 2 (Invalid ID) : PASS");
            passed++;
        }

        // =========================
        // TEST 3 - Hitung Harga Reguler
        // =========================
        total++;
        Film film1 = new Film("Merah Putih One For All", 70);
        Film film2 = new Film("Demon Slayer: Infinity Castle", 155);
        Film film3 = new Film("Spider-Man No Way Home", 157);
        
        Tiket reguler1 = new TiketReguler("MOFA-2026-0002", film1);
        Tiket reguler2 = new TiketReguler("DSIC-2026-0003", film2);
        Tiket reguler3 = new TiketReguler("SNWH-2026-0004", film3);

        if (reguler1.hitungHarga() == 80000 && reguler2.hitungHarga() == 50000 && reguler3.hitungHarga() == 55000) {
            System.out.println("Test 3 (Harga Reguler) : PASS");
            passed++;
        } else {
            System.out.println("Test 3 (Harga Reguler) : FAIL");
        }

        // =========================
        // TEST 4 - Hitung Harga VIP
        // =========================
        total++;
        Tiket vip1 = new TiketVIP("MOFA-2026-0005", film1);
        Tiket vip2 = new TiketVIP("DSIC-2026-0006", film2);
        Tiket vip3 = new TiketVIP("SNWH-2026-0007", film3);

        if (vip1.hitungHarga() == 100000 && vip2.hitungHarga() == 62500 && vip3.hitungHarga() == 68750) {
            System.out.println("Test 4 (Harga VIP) : PASS");
            passed++;
        } else {
            System.out.println("Test 4 (Harga VIP) : FAIL");
        }

        // =========================
        // TEST 5 - Interface Scan
        // =========================
        total++;
        Scannable s1 = (Scannable) reguler1;
        Scannable s2 = (Scannable) vip1;
        if (s1.scan().contains("berhasil discan") || s2.scan().contains("berhasil discan")) {
            System.out.println("Test 5 (Scan Interface) : PASS");
            passed++;
        } else {
            System.out.println("Test 5 (Scan Interface) : FAIL");
        }

        // =========================
        // TEST 6 - Polymorphism & Transaksi
        // =========================
        total++;
        Transaksi transaksi = new Transaksi();
        transaksi.tambahTiket(reguler1);
        transaksi.tambahTiket(reguler2);
        transaksi.tambahTiket(reguler3);
        transaksi.tambahTiket(vip1);
        transaksi.tambahTiket(vip2);
        transaksi.tambahTiket(vip3);

        if (transaksi.hitungTotal() == 416250) {
            System.out.println("Test 6 (Total Transaksi) : PASS");
            passed++;
        } else {
            System.out.println("Test 6 (Total Transaksi) : FAIL");
        }

        // =========================
        // TEST 7 - Jumlah Tiket
        // =========================
        total++;
        if (transaksi.getJumlahTiket() == 6) {
            System.out.println("Test 7 (Jumlah Tiket) : PASS");
            passed++;
        } else {
            System.out.println("Test 7 (Jumlah Tiket) : FAIL");
        }

        // =========================
        // HASIL AKHIR
        // =========================
        System.out.println("\n===============================");
        System.out.println("TOTAL TEST : " + total);
        System.out.println("PASSED     : " + passed);
        System.out.println("FAILED     : " + (total - passed));
        System.out.println("===============================");
        System.out.println("\nNILAI AKHIR : " + ((passed * 100)/7));
    }
}
