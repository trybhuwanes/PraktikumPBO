package com.merchant;

public class DataMerchant {
    static Merchant[] merc = new Merchant[0];

    public static Merchant[] tambahMerchant (Merchant merchant) {
        Merchant[] add = new Merchant[merc.length + 1];
        for (int i = 0; i < merc.length; i++) {
            add[i] = merc[i];
        }
        add[merc.length] = merchant;
        return add;
    }

    public static void tampilData() {
        for (Merchant merchant : merc) {
            System.out.println("===Tampilan Data Merchant UBFood===");
            System.out.println("Nama Merchant\t: " + merchant.getNamaMerchant());
            System.out.println("Nama Produk\t\t: " + merchant.getNamaProduk());
            System.out.println("Harga\t\t\t: " + (int) merchant.getHargaProduk());
        }
    }

    public static Merchant cariMerchant(String namaMerchant) {
        for (Merchant merchant : merc) {
            if (namaMerchant.equalsIgnoreCase(merchant.getNamaMerchant())) {
                return merchant;
            }
        }
        return null;
    }

    public static void tampilCariMerchant(Merchant merchant) {
        System.out.println("\n===Tampilan Data Merchant UBFood===");
        System.out.println("Nama Merchant\t: " + merchant.getNamaMerchant());
        System.out.println("Nama Produk\t\t: " + merchant.getNamaProduk());
        System.out.println("Harga\t\t\t: " + (int)merchant.getHargaProduk());
    }

    public static void updateMerchant(Merchant merchant, String namaMerchant,String namaProduk, double hargaProduk) {
        merchant.setNamaMerchant(namaMerchant);
        merchant.setNamaProduk(namaProduk);
        merchant.setHargaProduk(hargaProduk);
    }
}
