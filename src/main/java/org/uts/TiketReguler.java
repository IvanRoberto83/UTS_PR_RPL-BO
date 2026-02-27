package org.uts;

public class TiketReguler extends Tiket implements Scannable {
    public TiketReguler(String idTiket, double hargaDasar, Film film) {
        super(idTiket, hargaDasar, film);
    }

    @Override
    public double hitungHarga() {
        return getHargaDasar();
    }

    @Override
    public String scan() {
        return "Tiket Reguler " + getIdTiket() + " berhasil discan";
    }
}
