import java.util.Scanner;

public class MenghitungLuas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih = scan.nextInt();
        if (pilih == 1) {
            Persegi persegi1 = new Persegi();
            persegi1.sisi = scan.nextInt();
            System.out.println(persegi1.luasPersegi());
        } else if (pilih == 2) {
            Segitiga segitiga1 = new Segitiga();
            segitiga1.alas = scan.nextInt();
            segitiga1.tinggi = scan.nextInt();
            System.out.println(segitiga1.luasSegitiga());
        } else if (pilih == 3) {
            Lingkaran lingkaran2 = new Lingkaran();
            lingkaran2.r = scan.nextDouble();
            int hasil = (int) lingkaran2.luasLingkaran();
            System.out.println((double) hasil);
        } else {
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}

class Persegi {
    int sisi;
    int luasPersegi () {
        return sisi * sisi;
    }
}
class Segitiga {
    int alas, tinggi;
    int luasSegitiga () {
        return alas * tinggi / 2;
    }
}
class Lingkaran {
    double r;
    double luasLingkaran () {
        if (r%7 == 0) {
            return 22/7 * r * r;
        } else {
            return 3.14 * r * r;
        }
    }
}
