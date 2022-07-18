package com.pertemuan3.pertemuan3_modality.model;

public class Coffee {
    private String nama;
    private float harga;
    private float diskon;

    @Override
    public String toString() {
        String teks = nama + " " + harga;
        if (diskon != 0.0F) {
            float akhir = harga - (diskon * harga);
            teks = nama + " " + akhir + " (original price: " + harga
                    + ") Discount: " + diskon * 100 + "%";
        }
        return teks;
    }

    public Coffee(String nama, float harga, Float diskon) {
        this.nama = nama;
        this.harga = harga;
        this.diskon = diskon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }

    public float getDiskon() {
        return diskon;
    }

    public void setDiskon(float diskon) {
        this.diskon = diskon;
    }
}

