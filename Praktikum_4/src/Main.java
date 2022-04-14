package com.merchant;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nama\t: Try Bhuwaneswari\nNIM\t\t: 215150600111025\n");
        System.out.println("=====Welcome to UB Food=====");
        System.out.println("1. Tampil Data Merchant");
        System.out.println("2. Tambah Data Merchant");
        System.out.println("3. Ganti Data Merchant");
        System.out.println("4. Cari Merchant");
        System.out.print("Pilih menu : ");
        int pilih = scan.nextInt();

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));

        if (pilih == 1) {
            System.out.println();
            DataMerchant.tampilData();
        } else if (pilih == 2){
            System.out.println("\n========TAMBAH DATA MERCHANT========");
            System.out.print("Mau nambahin berapa merchant? ");
            int tambahData = scan.nextInt();
            for (int i = 0; i < tambahData; i++) {
                System.out.println("====================================");
                scan.nextLine();
                System.out.print("Masukkan Nama Merchant\t: ");
                String namaMerchant = scan.nextLine();
                System.out.print("Masukkan Nama Produk\t: ");
                String namaProduk = scan.nextLine();
                System.out.print("Masukkan Harga Produk\t: ");
                int hargaProduk = scan.nextInt();
                DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(namaMerchant, namaProduk, hargaProduk));
            }
            System.out.println();
            DataMerchant.tampilData();
        } else if (pilih == 3) {
            scan.nextLine();
            System.out.println("\n========GANTI DATA MERCHANT========");
            System.out.print("Nama merchant yang ingin diganti : ");
            String merchantLama = scan.nextLine();
            System.out.print("Nama merchant baru\t: ");
            String merchantBaru = scan.nextLine();
            System.out.print("Nama produk baru\t: ");
            String produkBaru = scan.nextLine();
            System.out.print("Harga produk baru\t: ");
            double hargaBaru = scan.nextDouble();
            DataMerchant.updateMerchant(Objects.requireNonNull(DataMerchant.cariMerchant(merchantLama)), merchantBaru, produkBaru, hargaBaru);
            System.out.println();
            DataMerchant.tampilData();
        } else {
            scan.nextLine();
            System.out.print("Masukkan Nama Merchant\t: ");
            String cariNamaMerchant = scan.nextLine();
            DataMerchant.cariMerchant(cariNamaMerchant);
            DataMerchant.tampilCariMerchant(Objects.requireNonNull(DataMerchant.cariMerchant(cariNamaMerchant)));
        }
    }
}
