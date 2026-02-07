package sa;


import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] books = new String[10];
        boolean[] borrowed = new boolean[10];
        int bookCount = 0;

        while (true) {
            System.out.println("\n--- Mini Kütüphane ---");
            System.out.println("1- Kitap Ekle");
            System.out.println("2- Kitapları Listele");
            System.out.println("3- Kitap Ödünç Al");
            System.out.println("4- Kitap İade Et");
            System.out.println("0- Çıkış");
            System.out.print("Seçimin: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) {
                System.out.println("Program kapatıldı.");
                break;
            }

            else if (choice == 1) {
                if (bookCount >= books.length) {
                    System.out.println("Kütüphane dolu.");
                } else {
                    System.out.print("Kitap adı gir: ");
                    books[bookCount] = sc.nextLine();
                    borrowed[bookCount] = false;
                    bookCount++;
                    System.out.println("Kitap eklendi.");
                }
            }

            else if (choice == 2) {
                if (bookCount == 0) {
                    System.out.println("Henüz kitap yok.");
                } else {
                    for (int i = 0; i < bookCount; i++) {
                        String durum = borrowed[i] ? "Ödünçte" : "Rafta";
                        System.out.println((i + 1) + ". " + books[i] + " - " + durum);
                    }
                }
            }

            else if (choice == 3) {
                System.out.print("Ödünç almak istediğin kitap no: ");
                int no = sc.nextInt() - 1;

                if (no < 0 || no >= bookCount) {
                    System.out.println("Geçersiz numara.");
                } else if (borrowed[no]) {
                    System.out.println("Bu kitap zaten ödünçte.");
                } else {
                    borrowed[no] = true;
                    System.out.println("Kitap ödünç alındı.");
                }
            }

            else if (choice == 4) {
                System.out.print("İade edilecek kitap no: ");
                int no = sc.nextInt() - 1;

                if (no < 0 || no >= bookCount) {
                    System.out.println("Geçersiz numara.");
                } else if (!borrowed[no]) {
                    System.out.println("Bu kitap zaten rafta.");
                } else {
                    borrowed[no] = false;
                    System.out.println("Kitap iade edildi.");
                }
            }

            else {
                System.out.println("Hatalı seçim.");
            }
        }

        sc.close();
    }
}
