import java.util.Scanner;

public class HitungLuas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih = scan.nextInt();
        if (pilih == 1) {
            int sisi = scan.nextInt();
            System.out.println(persegi(sisi));
        } else if (pilih == 2) {
            int alas = scan.nextInt();
            int tinggi = scan.nextInt();
            System.out.println(segitiga(alas, tinggi));
        } else if (pilih == 3) {
            Double r = scan.nextDouble();
            if (r%7==0) {
                System.out.println(ling(r));
            } else {
                Double hasil = lingk(r);
                int hasil1 = hasil.intValue();
                Double hasil2 = (double) hasil1;
                System.out.println(hasil2);
            }
        } else {
            System.out.println("Input yang anda masukan tidak sesuai");
        }


    }

    static int persegi (int s) {
        return s * s;
    }

    static int segitiga (int alas, int tinggi) {
        return alas * tinggi / 2;
    }

    static Double ling (Double r) {
        return 22/7 * r * r;
    }

    static Double lingk (Double r) {
        return 3.14 * r * r;
    }
}
