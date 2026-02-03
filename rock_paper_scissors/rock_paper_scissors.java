package sa;

import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Tas", "Kagit", "Makas"};

        System.out.println("Tas - Kagit - Makas Oyununa Hos Geldin");
        System.out.println("0 = Tas, 1 = Kagit, 2 = Makas");

        while (true) {
            System.out.print("Secimin (cikmak icin -1): ");
            int userChoice = sc.nextInt();

            if (userChoice == -1) {
                System.out.println("Oyun bitti.");
                break;
            }

            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Gecersiz secim.");
                continue;
            }

            int computerChoice = random.nextInt(3);

            System.out.println("Sen: " + choices[userChoice]);
            System.out.println("Bilgisayar: " + choices[computerChoice]);

            if (userChoice == computerChoice) {
                System.out.println("Berabere!");
            } else if (
                (userChoice == 0 && computerChoice == 2) ||
                (userChoice == 1 && computerChoice == 0) ||
                (userChoice == 2 && computerChoice == 1)
            ) {
                System.out.println("Kazandin!");
            } else {
                System.out.println("Kaybettin!");
            }
        }

        sc.close();
    }
}
