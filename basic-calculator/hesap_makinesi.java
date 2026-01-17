package sa;

import java.util.Scanner;

public class hesap_makinesi {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);


int sayi,sayi1,sayi2;

System.out.println("ilk sayıyı giriniz");
sayi1 = input.nextInt();

System.out.println("ikinci sayıyı giriniz");
sayi2 = input.nextInt();

System.out.println("yapmak istediğiniz işlemi seçiniz:");
System.out.println("yapabileceğiniz işlemler:\n1 : Toplama\n2 : çıkarma\n3 : çarpma\n4 : bölme\nLütfen yapmak istediğiniz işlem numarasını yazınız..");

sayi = input.nextInt();
switch (sayi) {
case 1:
	System.out.println("sonuç : " + (sayi1 + sayi2));
	break;
	
case 2:
	System.out.println("sonuç : " + (sayi1 - sayi2));
	break;
case 3:
	System.out.println("sonuç : " + (sayi1 * sayi2));
	break;
case 4:
	System.out.println("sonuç : " + (sayi1 / sayi2));
	break;
	default:
		System.out.println("geçersiz bir işlem numarası giridniz.");
}




	}

}
