package sa;

import java.util.Scanner;

public class MiniATM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String dogruSifre = "1234";
        double bakiye = 1000.0;
        int secim;

        System.out.println("===== MINI ATM SISTEMI =====");

        System.out.print("Sifre girin: ");
        String girilenSifre = scanner.nextLine();

        if (!girilenSifre.equals(dogruSifre)) {
            System.out.println("Hatali sifre. Program sonlandiriliyor.");
            return;
        }

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Bakiye Goruntule");
            System.out.println("2 - Para Yatir");
            System.out.println("3 - Para Cek");
            System.out.println("4 - Cikis");
            System.out.print("Seciminiz: ");

            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Guncel bakiyeniz: " + bakiye + " TL");
                    break;

                case 2:
                    System.out.print("Yatirilacak miktar: ");
                    double yatirilan = scanner.nextDouble();

                    if (yatirilan > 0) {
                        bakiye += yatirilan;
                        System.out.println("Yeni bakiye: " + bakiye + " TL");
                    } else {
                        System.out.println("Gecersiz miktar.");
                    }
                    break;

                case 3:
                    System.out.print("Cekilecek miktar: ");
                    double cekilen = scanner.nextDouble();

                    if (cekilen > 0 && cekilen <= bakiye) {
                        bakiye -= cekilen;
                        System.out.println("Kalan bakiye: " + bakiye + " TL");
                    } else {
                        System.out.println("Yetersiz bakiye veya gecersiz miktar.");
                    }
                    break;

                case 4:
                    System.out.println("Cikis yapiliyor... Iyi gunler!");
                    break;

                default:
                    System.out.println("Gecersiz secim.");
            }

        } while (secim != 4);

        scanner.close();
    }
}
