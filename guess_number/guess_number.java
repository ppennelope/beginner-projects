package sa;


import java.util.Random;
import java.util.Scanner;

public class guess_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("1 ile 100 arasında bir sayı tuttum.");

        while (true) {
            System.out.print("Tahminin: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Daha büyük bir sayı gir.");
            } else if (guess > secretNumber) {
                System.out.println("Daha küçük bir sayı gir.");
            } else {
                System.out.println("Tebrikler! " + attempts + " denemede bildin.");
                break;
            }
        }

        sc.close();
    }
}
