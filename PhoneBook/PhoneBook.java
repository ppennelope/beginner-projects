package sa;


import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        String[] phones = new String[10];
        int count = 0;

        while (true) {
            System.out.println("\n--- Telefon Rehberi ---");
            System.out.println("1- Kişi Ekle");
            System.out.println("2- Kişileri Listele");
            System.out.println("3- Kişi Ara");
            System.out.println("0- Çıkış");
            System.out.print("Seçim: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) {
                System.out.println("Program kapatıldı.");
                break;
            }

            else if (choice == 1) {
                if (count >= names.length) {
                    System.out.println("Rehber dolu.");
                } else {
                    System.out.print("İsim gir: ");
                    names[count] = sc.nextLine();

                    System.out.print("Telefon gir: ");
                    phones[count] = sc.nextLine();

                    count++;
                    System.out.println("Kişi eklendi.");
                }
            }

            else if (choice == 2) {
                if (count == 0) {
                    System.out.println("Rehber boş.");
                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + names[i] + " - " + phones[i]);
                    }
                }
            }

            else if (choice == 3) {
                System.out.print("Aranacak isim: ");
                String search = sc.nextLine();
                boolean found = false;

                for (int i = 0; i < count; i++) {
                    if (names[i].equalsIgnoreCase(search)) {
                        System.out.println("Bulundu: " + names[i] + " - " + phones[i]);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Kişi bulunamadı.");
                }
            }

            else {
                System.out.println("Hatalı seçim.");
            }
        }

        sc.close();
    }
}
