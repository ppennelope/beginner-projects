package sa;


import java.util.Scanner;

public class TextAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Metin giriniz:");
        String text = sc.nextLine();

        int charCount = text.length();

        String[] words = text.trim().split("\\s+");
        int wordCount = words.length;

        int vowelCount = 0;
        String vowels = "aeiouAEIOUöÖüÜıİ";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (vowels.indexOf(c) != -1) {
                vowelCount++;
            }
        }

        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        int sentenceCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '.' || c == '!' || c == '?') {
                sentenceCount++;
            }
        }

        System.out.println("\n--- ANALIZ SONUCLARI ---");
        System.out.println("Karakter sayisi: " + charCount);
        System.out.println("Kelime sayisi: " + wordCount);
        System.out.println("Sesli harf sayisi: " + vowelCount);
        System.out.println("Cumle sayisi: " + sentenceCount);
        System.out.println("En uzun kelime: " + longestWord);

        sc.close();
    }
}
