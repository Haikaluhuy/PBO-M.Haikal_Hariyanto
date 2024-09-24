package com.example;

public class Jadwal {
    private String hari;
    private MataKuliah mataKuliah; // Aggregation
    private Dosen dosen; // Dependency
    private Ruangan ruangan; // Aggregation

    public Jadwal(String hari, MataKuliah mataKuliah, Dosen dosen, Ruangan ruangan) {
        this.hari = hari;
        this.mataKuliah = mataKuliah;
        this.dosen = dosen;
        this.ruangan = ruangan;
    }

    @Override
    public String toString() {
        return String.format("Hari: %s, Mata Kuliah: %s, Dosen: %s, Ruangan: %s",
                hari, mataKuliah.getNama(), dosen.getNama(), ruangan.getNama());
    }
}

