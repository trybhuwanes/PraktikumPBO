import java.util.Scanner;

public class SuratKaisar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kata = scan.nextLine();
        int angka = scan.nextInt();
        System.out.println(geserKata(kata,angka));
    }

    static String geserKata (String kata, int angka) {
        String udahGeser = "";
        char alfabet;
        for(int i = 0; i < kata.length(); i++) {
            alfabet = kata.charAt(i);

            if(alfabet >= 'a' && alfabet <= 'z') {
                alfabet = (char) (alfabet + angka);
                if(alfabet > 'z') {
                    alfabet = (char) (alfabet+'a'-'z'-1);
                }
                udahGeser = udahGeser + alfabet;
            } else if(alfabet >= 'A' && alfabet <= 'Z') {
                alfabet = (char) (alfabet + angka);
                if(alfabet > 'Z') {
                    alfabet = (char) (alfabet+'A'-'Z'-1);
                }
                udahGeser = udahGeser + alfabet;
            } else {
                udahGeser = udahGeser + alfabet;
            }
        }
        return udahGeser;
    }
}
