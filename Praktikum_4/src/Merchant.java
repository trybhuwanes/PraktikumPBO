package com.merchant;

public class Merchant extends DataMerchant {
    private String namaMerchant, namaProduk;
    private double hargaProduk;

    public Merchant(String namaMerchant, String namaProduk, double hargaProduk) {
        this.namaMerchant = namaMerchant;
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
    }

    public String getNamaMerchant() {
        return namaMerchant;
    }

    public void setNamaMerchant(String namaMerchant) {
        this.namaMerchant = namaMerchant;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHargaProduk() {
        return hargaProduk;
    }

    public void setHargaProduk(double hargaProduk) {
        this.hargaProduk = hargaProduk;
    }
}
