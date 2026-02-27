package org.uts;

import java.util.ArrayList;

public class Transaksi {
    private ArrayList<Tiket> daftarTiket;

    public Transaksi() {
        daftarTiket = new ArrayList<>();
    }

    public void tambahTiket(Tiket t) {
        daftarTiket.add(t);
    }

    public double hitungTotal() {
        double total = 0;
        for (Tiket t : daftarTiket) {
            total += t.hitungHarga(); 
        }
        return total;
    }

    public int getJumlahTiket() {
        return daftarTiket.size();
    }
}
