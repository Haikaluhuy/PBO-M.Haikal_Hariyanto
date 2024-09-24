package com.example;

public class Mahasiswa extends Person {
    private String nim;

    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public String toString() {
        return String.format("Nama: %s, NIM: %s", getNama(), nim);
    }
}
