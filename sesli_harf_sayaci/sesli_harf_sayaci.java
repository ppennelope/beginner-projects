package sa;

import java.util.Scanner;

public class sesli_harf_sayaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kelime giriniz: ");
        String kelime = input.nextLine();

        int sayac = 0;

        kelime = kelime.toLowerCase();

        for (int i = 0; i < kelime.length(); i++) {
            char h = kelime.charAt(i);

            if (h == 'a') {
                sayac++;
            } else if (h == 'e') {
                sayac++;
            } else if (h == 'ı') {
                sayac++;
            } else if (h == 'i') {
                sayac++;
            } else if (h == 'o') {
                sayac++;
            } else if (h == 'ö') {
                sayac++;
            } else if (h == 'u') {
                sayac++;
            } else if (h == 'ü') {
                sayac++;
            }
        }

        System.out.println("Sesli harf sayısı: " + sayac);
    }
}