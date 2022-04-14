import java.util.Scanner;

public class Baju {
    public String jenis;
    public int harga, jumlah;

    public Baju(String jenis, int jumlah) {
        this.jenis = jenis;
        this.jumlah = jumlah;
    }

    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;

    void hargaa() {
        if (jumlah > 100) harga = 95000;
        else harga = bajua;
    }
    void  hargab() {
        if (jumlah > 100) harga = 120000;
        else harga = bajub;
    }
    void hargac() {
        if (jumlah > 100) harga = 160000;
        else harga = bajuc;
    }

    void display() {
        if (jenis.equalsIgnoreCase("a")) this.hargaa();
        else if (jenis.equalsIgnoreCase("b")) this.hargab();
        else if (jenis.equalsIgnoreCase("c")) this.hargac();
        System.out.println("Jenis yang anda beli: " + jenis);
        System.out.println("Harga per buah\t\t: " + harga);
        System.out.println("Total Harga\t\t\t: " + harga * jumlah);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Nama \t : Try Bhuwaneswari" );
        System.out.println("NIM \t : 215150600111025 \n");
        System.out.println("Baju yang tersedia: ");
        System.out.println("Baju A dengan harga: 95000");
        System.out.println("Baju B dengan harga: 100000");
        System.out.println("Baju C dengan harga: 175000");
        Scanner scan = new Scanner(System.in);
        System.out.print("Baju yang akan anda beli bertipe\t\t: ");
        String jenis = scan.nextLine();
        System.out.print("Jumlah baju yang akan anda beli adalah\t: ");
        int jumlah = scan.nextInt();

        Baju jaket = new Baju(jenis, jumlah);
        jaket.display();
    }
}
