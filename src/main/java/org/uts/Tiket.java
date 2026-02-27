package org.uts;

import java.util.regex.Pattern;

public abstract class Tiket {
    private String idTiket;
    private double hargaDasar;
    private Film film;

    public Tiket(String idTiket, double hargaDasar, Film film) {
        if (!validasiId(idTiket)) {
            throw new IllegalArgumentException("Format ID tiket tidak valid!");
        }
        this.idTiket = idTiket;
        this.hargaDasar = hargaDasar;
        this.film = film;
    }

    public String getIdTiket() {
        return idTiket;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    public void setHargaDasar(double hargaDasar) {
        this.hargaDasar = hargaDasar;
    }

    public Film getFilm() {
        return film;
    }

    public String getInfo() {
        return "ID: " + idTiket +
               ", Film: " + film.getJudul() +
               ", Harga Dasar: " + hargaDasar;
    }

    public boolean validasiId(String idTiket) {
        // Format: TKT-YYYY-XXXX
        String regex = "^TKT-\\d{4}-\\d{4}$";
        return Pattern.matches(regex, idTiket);
    }

    public abstract double hitungHarga();
}