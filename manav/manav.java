package sa;


import java.util.Scanner;

public class manav {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] urunler = {"Elma", "Muz", "Domates", "Patates", "Portakal"};
        double[] fiyatlar = {30, 45, 25, 20, 35};

        double toplamTutar = 0;
        int secim;

        do {
            System.out.println("\n--- MANAV OTOMASYONU ---");
            for (int i = 0; i < urunler.length; i++) {
                System.out.println((i + 1) + " - " + urunler[i] + " : " + fiyatlar[i] + " TL/kg");
            }
            System.out.println("0 - Çıkış Yap");

            System.out.print("Ürün seçiniz: ");
            secim = scanner.nextInt();

            if (secim > 0 && secim <= urunler.length) {
                System.out.print("Kaç kilo almak istiyorsunuz: ");
                double kilo = scanner.nextDouble();

                double tutar = kilo * fiyatlar[secim - 1];
                toplamTutar += tutar;

                System.out.println(urunler[secim - 1] + " için tutar: " + tutar + " TL");
            }

        } while (secim != 0);

        System.out.println("\nToplam Ödemeniz Gereken Tutar: " + toplamTutar + " TL");
        System.out.println("İyi günler!");

        scanner.close();
    }
}
