
package sa;
import java.util.Random;
import java.util.Scanner;

public class dice_game {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	
	System.out.println("zar atma oyununa hoşgeldiniz");
	
	while (true) {
	System.out.println("zar atmak için enter (çıkmak için 0): ");
	String input = sc.nextLine();
	
	if(input.equals("0")) {
		System.out.println("oyun bitti.");
		break;
	}
	int userDice = random.nextInt(6) + 1;
	int computerDice = random.nextInt(6) + 1;
	System.out.println("Senin zarın: " + userDice);
	System.out.println("Bilgisayarın zarı :" + computerDice);
	
	if(userDice > computerDice) {
		System.out.println("kazandin!");
	}else if (userDice < computerDice) {
		System.out.println("kaybettin!");
	}else {
		System.out.println("berabere");
	}
	}
	sc.close();
	}
}
