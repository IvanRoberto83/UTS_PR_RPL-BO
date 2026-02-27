package org.uts;

public class Film {
    private String judul;
    private int durasi;

    public Film(String judul, int durasi) {
        this.judul = judul;
        this.durasi = durasi;
    }

    public String getJudul() {
        return judul;
    }

    public int getDurasi() {
        return durasi;
    }
}
