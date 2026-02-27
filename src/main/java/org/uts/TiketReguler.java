package org.uts;

public class TiketReguler extends Tiket implements Scannable {
    public TiketReguler(String idTiket, Film film) {
        super(idTiket, film);
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
