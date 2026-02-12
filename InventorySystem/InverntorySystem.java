package sa;
import java.util.Scanner;

public class InverntorySystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] products = new String[20];
		int [] stock = new int [20];
		int count = 0;
		
		while(true) {
			System.out.println("\n---Envanter Sistemi---");
			System.out.println("1-Ürün Ekle");
			System.out.println("2-Stok arttır");
			System.out.println("3-Stok azalt");
			System.out.println("4- Ürünleri Listele");
			System.out.println("5-Ürün Sil");
			System.out.println("0-Çıkış");
			System.out.println("Seçim: ");
			 int choice =sc.nextInt();
			 sc.nextLine();
			 
			 if (choice==0) {
				 System.out.println("program kapatıldı");
				 break;
				 
			 }
			 else if (choice==1) {
				 if (count >= products.length) {
					 System.out.println("depo dolu");
					 
				 }else {
					 System.out.println("ürün adı: ");
					 products[count]= sc.nextLine();
					 
					 System.out.println("başlangıç stoğu: ");
					 stock[count] = sc.nextInt();
					 sc.nextLine();
					 
					 count++;
					 System.out.println("ürün eklendi");
					
				 }
			 }
			 else if(choice ==2 ) {
				 System.out.println("stok artırılacak ürün no:");
				 int no = sc.nextInt() -1 ;
				 if(no<0 || no>=count) {
					 System.out.println("geçersiz numara");
				 }else {
					 System.out.println("eklenecek miktar");
					 int miktar = sc.nextInt();
					 stock[no] += miktar;
					 System.out.println("Stok güncellendi.");
					 
				 }
			 }
			 else if (choice==3) {
				 System.out.println("Stok azaltılacak ürün no");
				 int no = sc.nextInt()-1;
				 
				 if(no<0 || no>= count) {
					 System.out.println("geçersiz numara.");
				 }else {
					 System.out.println("azaltılacak miktar: ");
					 int miktar = sc.nextInt();
					 
					 if (miktar > stock [no]) {
						 System.out.println("yetersiz stok");
					 }else {
						 stock[no] -= miktar;
						 System.out.println("stok güncellendi.");
					 }
				 }
			 }
			 
			 else if(choice==4) {
				 if (count==0) {
					 System.out.println("Hiç ürün yok.");
				 }else {
					 for(int i= 0; i<count;i++) {
						 String kritik = stock[i]< 5 ? "(kritik seviye)" : "";
						 System.out.println((i+1) + ". "+ products[i] + " - Stok: " +stock[i]);
						 
					 }
				 }
			 }
			 
			 else if (choice==5 ) {
				 System.out.println("Silinecek ürün no: ");
				 int no = sc.nextInt() - 1;
				 
				 if(no<0 || no>= count) {
					 System.out.println("geçersiz numara.");
					 
				 }else {
					 for(int i = no; i<count-1;i++) {
						 products[i] = products[i+1];
						 stock[i]= stock[i+1];
						 
					 }
					 
					 count--;
					 System.out.println("ürün silidni...");
				 }
			 }
			 else {
				 System.out.println("hatalı seçim");
			 }
		}
		sc.close();
	}

}
