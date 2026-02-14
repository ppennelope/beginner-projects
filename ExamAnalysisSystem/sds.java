package sa;


import java.util.Scanner;

public class sds {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Kaç öğrenci var: ");
        int ogrenciSayisi = sc.nextInt();

        System.out.print("Sınav kaç sorudan oluşuyor: ");
        int soruSayisi = sc.nextInt();

        int[][] notlar = new int[ogrenciSayisi][soruSayisi];
        double[] ortalamalar = new double[ogrenciSayisi];

        // Notları alma (İÇ İÇE DÖNGÜ)
        for (int i = 0; i < ogrenciSayisi; i++) {

            System.out.println("\n" + (i + 1) + ". öğrenci:");

            for (int j = 0; j < soruSayisi; j++) {

                System.out.print((j + 1) + ". soru puanı: ");
                notlar[i][j] = sc.nextInt();
            }
        }

        double sinifToplam = 0;
        int enYuksek = 0;

        // Ortalama ve analiz
        for (int i = 0; i < ogrenciSayisi; i++) {

            int toplam = 0;

            for (int j = 0; j < soruSayisi; j++) {
                toplam += notlar[i][j];
            }

            ortalamalar[i] = (double) toplam / soruSayisi;
            sinifToplam += ortalamalar[i];

            if (ortalamalar[i] > enYuksek) {
                enYuksek = (int) ortalamalar[i];
            }
        }

        double sinifOrt = sinifToplam / ogrenciSayisi;

        // Sonuçları yazdırma
        System.out.println("\n--- SONUÇLAR ---");

        for (int i = 0; i < ogrenciSayisi; i++) {
            System.out.println((i + 1) + ". öğrenci ortalama: " + ortalamalar[i]);
        }

        System.out.println("Sınıf ortalaması: " + sinifOrt);
        System.out.println("En yüksek ortalama: " + enYuksek);

        sc.close();
    }
}
