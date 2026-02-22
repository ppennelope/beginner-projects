package sa;


import java.util.Scanner;

public class NumberPyramidAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı gir (örn: 5): ");
        int n = sc.nextInt();

        int toplamEleman = 0;
        int tekSayisi = 0;
        int ciftSayisi = 0;
        int enBuyuk = 0;

        System.out.println("\n--- SAYI PİRAMİDİ ---");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");

                toplamEleman++;

                if (j % 2 == 0)
                    ciftSayisi++;
                else
                    tekSayisi++;

                if (j > enBuyuk)
                    enBuyuk = j;
            }

            System.out.println();
        }

        System.out.println("\n--- ANALİZ ---");
        System.out.println("Toplam yazılan sayı: " + toplamEleman);
        System.out.println("Tek sayı adedi: " + tekSayisi);
        System.out.println("Çift sayı adedi: " + ciftSayisi);
        System.out.println("En büyük sayı: " + enBuyuk);

        sc.close();
    }
}