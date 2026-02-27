package org.uts;

public class TiketVIP extends Tiket implements Scannable {
    public TiketVIP(String idTiket, double hargaDasar, Film film) {
        super(idTiket, hargaDasar, film);
    }

    @Override
    public double hitungHarga() {
        return getHargaDasar() + (getHargaDasar() * 0.25); 
    }

    @Override
    public String scan() {
        return "Tiket VIP " + getIdTiket() + " berhasil discan";
    }
}