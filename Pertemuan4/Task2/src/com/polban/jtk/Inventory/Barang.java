package com.polban.jtk.inventory;

public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        this.stok = stk;
    }

    public String getKode_barang() {
        return kode_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public int getStok() {
        return stok;
    }

    // Metode untuk menambah stok
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
        } else {
            System.out.println("Jumlah yang ditambahkan harus positif!");
        }
    }

    // Metode untuk mengurangi stok
    public void kurangiStok(int jumlah) {
        if (jumlah > 0 && stok >= jumlah) {
            stok -= jumlah;
        } else {
            System.out.println("Jumlah yang dikurangi tidak valid!");
        }
    }
}
