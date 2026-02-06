package sa;


import java.util.Random;
import java.util.Scanner;

public class MiniGameCenter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;

        while (true) {
            System.out.println("\n--- MINI OYUN MERKEZI ---");
            System.out.println("1 - Zar Oyunu");
            System.out.println("2 - Sayi Tahmin Oyunu");
            System.out.println("0 - Cikis");
            System.out.print("Secimin: ");

            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Oyun bitti. Toplam puan: " + score);
                break;
            }

            if (choice == 1) {
                int userDice = random.nextInt(6) + 1;
                int computerDice = random.nextInt(6) + 1;

                System.out.println("Senin zarin: " + userDice);
                System.out.println("Bilgisayarin zari: " + computerDice);

                if (userDice > computerDice) {
                    System.out.println("Kazandin (+10 puan)");
                    score += 10;
                } else if (userDice < computerDice) {
                    System.out.println("Kaybettin (-5 puan)");
                    score -= 5;
                } else {
                    System.out.println("Berabere (puan yok)");
                }

            } else if (choice == 2) {
                int secretNumber = random.nextInt(5) + 1;
                System.out.print("1-5 arasi bir sayi tahmin et: ");
                int guess = sc.nextInt();

                if (guess == secretNumber) {
                    System.out.println("Dogru tahmin (+15 puan)");
                    score += 15;
                } else {
                    System.out.println("Yanlis tahmin. Dogru sayi: " + secretNumber);
                    score -= 5;
                }

            } else {
                System.out.println("Gecersiz secim.");
            }

            System.out.println("Guncel puan: " + score);
        }

        sc.close();
    }
}
