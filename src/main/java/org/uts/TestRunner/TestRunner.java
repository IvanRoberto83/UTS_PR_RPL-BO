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
            Film film = new Film("Avengers", 120);
            Tiket t = new TiketReguler("TKT-2026-0001", 50000, film);
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
            Film film = new Film("Avengers", 120);
            Tiket t = new TiketReguler("SALAH", 50000, film);
            System.out.println("Test 2 (Invalid ID) : FAIL");
        } catch (IllegalArgumentException e) {
            System.out.println("Test 2 (Invalid ID) : PASS");
            passed++;
        }

        // =========================
        // TEST 3 - Hitung Harga Reguler
        // =========================
        total++;
        Film film1 = new Film("Batman", 130);
        Tiket reguler = new TiketReguler("TKT-2026-0002", 50000, film1);

        if (reguler.hitungHarga() == 50000) {
            System.out.println("Test 3 (Harga Reguler) : PASS");
            passed++;
        } else {
            System.out.println("Test 3 (Harga Reguler) : FAIL");
        }

        // =========================
        // TEST 4 - Hitung Harga VIP
        // =========================
        total++;
        Tiket vip = new TiketVIP("TKT-2026-0003", 50000, film1);

        if (vip.hitungHarga() == 62500) {
            System.out.println("Test 4 (Harga VIP) : PASS");
            passed++;
        } else {
            System.out.println("Test 4 (Harga VIP) : FAIL");
        }

        // =========================
        // TEST 5 - Interface Scan
        // =========================
        total++;
        Scannable s = (Scannable) reguler;
        if (s.scan().contains("berhasil discan")) {
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
        transaksi.tambahTiket(reguler);
        transaksi.tambahTiket(vip);

        if (transaksi.hitungTotal() == 112500) {
            System.out.println("Test 6 (Total Transaksi) : PASS");
            passed++;
        } else {
            System.out.println("Test 6 (Total Transaksi) : FAIL");
        }

        // =========================
        // TEST 7 - Jumlah Tiket
        // =========================
        total++;
        if (transaksi.getJumlahTiket() == 2) {
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
