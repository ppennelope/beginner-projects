package sa;


import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir şifre girin: ");
        String sifre = sc.nextLine();

        kontrolEt(sifre);

        sc.close();
    }

    public static void kontrolEt(String sifre) {

        boolean buyukHarf = false;
        boolean kucukHarf = false;
        boolean rakam = false;
        boolean ozelKarakter = false;

        for (int i = 0; i < sifre.length(); i++) {

            char c = sifre.charAt(i);

            if (Character.isUpperCase(c)) {
                buyukHarf = true;
            }
            else if (Character.isLowerCase(c)) {
                kucukHarf = true;
            }
            else if (Character.isDigit(c)) {
                rakam = true;
            }
            else {
                ozelKarakter = true;
            }
        }

        if (sifre.length() < 8) {
            System.out.println("Şifre çok kısa (en az 8 karakter).");
        }

        if (buyukHarf && kucukHarf && rakam && ozelKarakter && sifre.length() >= 8) {
            System.out.println("Şifre güçlü.");
        }
        else {
            System.out.println("Şifre zayıf.");
        }
    }
}
