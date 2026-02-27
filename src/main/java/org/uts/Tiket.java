package org.uts;

import java.util.regex.Pattern;

public abstract class Tiket {
    private String idTiket;
    private double hargaDasar;
    private Film film;

    public Tiket(String idTiket, Film film) {
        this.idTiket = idTiket;
        this.film = film;

        if(film.getJudul() == "Merah Putih One For All"){
            this.hargaDasar = 80000;
        }
        else if(film.getJudul() == "Demon Slayer: Infinity Castle"){
            this.hargaDasar = 50000;
        }
        else{
            this.hargaDasar = 55000;
        }

        if (!validasiId(idTiket)) {
            throw new IllegalArgumentException("Format ID tiket tidak valid!");
        }
    }

    public String getIdTiket() {
        return idTiket;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    public String getInfo() {
        return "ID: " + idTiket +
               ", Film: " + film.getJudul() +
               ", Harga Dasar: " + hargaDasar;
    }

    public boolean validasiId(String idTiket) {
        if(film.getJudul() == "Merah Putih One For All"){
            String regex = "^MOFA-\\d{4}-\\d{4}$";
            return Pattern.matches(regex, idTiket);
        }
        else if(film.getJudul() == "Demon Slayer: Infinity Castle"){
            String regex = "^DSIC-\\d{4}-\\d{4}$";
            return Pattern.matches(regex, idTiket);
        }
        else{
            String regex = "^SNWH-\\d{4}-\\d{4}$";
            return Pattern.matches(regex, idTiket);
        }
    }

    public abstract double hitungHarga();
}