package com.example;

public class Dosen extends Person {
    private String kodeDosen;

    public Dosen(String nama, String kodeDosen) {
        super(nama);
        this.kodeDosen = kodeDosen;
    }

    public String getKodeDosen() {
        return kodeDosen;
    }

    @Override
    public String toString() {
        return String.format("Nama: %s, Kode Dosen: %s", getNama(), kodeDosen);
    }
}

