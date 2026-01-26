package sa;

public class AsalSayilar {

    public static void main(String[] args) {

        System.out.println("1 ile 100 arasindaki asal sayilar:");

        for (int sayi = 2; sayi <= 100; sayi++) {

            boolean asalMi = true;

            for (int i = 2; i <= sayi / 2; i++) {
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi) {
                System.out.print(sayi + " ");
            }
        }
    }
}
