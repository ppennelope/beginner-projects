package sa;

import java.util.Scanner;

public class armstrong_numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir ust sinir girin: ");
        int ustSinir = scanner.nextInt();

        System.out.println("\n0 ile " + ustSinir + " arasindaki Armstrong sayilari:\n");

        for (int sayi = 0; sayi <= ustSinir; sayi++) {

            int geciciSayi = sayi;
            int basamakSayisi = 0;
            int toplam = 0;

            // 1. Basamak sayisini bul
            while (geciciSayi != 0) {
                geciciSayi /= 10;
                basamakSayisi++;
            }

            geciciSayi = sayi;

            // 2. Her basamagin kuvvetlerini hesapla
            while (geciciSayi != 0) {
                int basamak = geciciSayi % 10;
                int kuvvet = 1;

                for (int i = 1; i <= basamakSayisi; i++) {
                    kuvvet *= basamak;
                }

                toplam += kuvvet;
                geciciSayi /= 10;
            }

            // 3. Armstrong kontrolü
            if (toplam == sayi) {
                System.out.println(sayi + " bir Armstrong sayidir.");
            }
        }

        scanner.close();
    }
}
