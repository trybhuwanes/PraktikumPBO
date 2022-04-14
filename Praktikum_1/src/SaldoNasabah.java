import java.util.Scanner;

public class SaldoNasabah {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int saldo = scan.nextInt();
        int nabung = scan.nextInt();
        System.out.println(hitung(saldo, nabung));
    }

    static Double hitung (int saldo, int nabung) {
        return ((saldo - 7000 + nabung) * 0.05/100) + (saldo - 7000 + nabung);
    }
}
