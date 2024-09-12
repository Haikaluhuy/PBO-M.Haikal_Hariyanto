package com.polban.jtk.sales;

public class Sales {
    private Product product;

    public Sales(Product product) {
        this.product = product;
    }

    public void sellProduct(int quantity) {
        System.out.println("Memproses penjualan...");
        product.sellProduct(quantity);
        System.out.println("Stok setelah penjualan: " + product.getStock());
    }

    public void restockProduct(int quantity) {
        System.out.println("Menambah stok...");
        product.addStock(quantity);
        System.out.println("Stok setelah penambahan: " + product.getStock());
    }

    public void updateProductPrice(double newPrice) {
        System.out.println("Memperbarui harga produk...");
        product.setPrice(newPrice);
        System.out.println("Harga baru: " + product.getFormattedPrice());
    }
}
