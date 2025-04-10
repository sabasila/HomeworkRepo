package day16;
import java.util.Scanner;
public class Hw
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანეთ სტრიქონი: ");
        String input = scanner.nextLine();
        // 1
        int digitCount = 0;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        System.out.println("სტრიქონში ციფრების რაოდენობა: " + digitCount);

        // 2
        String[] sentences = input.split("[.!?;]");
        int sentenceCount = sentences.length;
        System.out.println("სტრიქონში წინადადებების რაოდენობა: " + sentenceCount);

        // 3
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleanedInput).reverse().toString();
        boolean isPalindrome = cleanedInput.equals(reversed);
        System.out.println("სტრიქონი არის პალინდრომი: " + isPalindrome);

        // 4.
        System.out.print("შეიყვანეთ s1: ");
        String s1 = scanner.nextLine();
        System.out.print("შეიყვანეთ s2: ");
        String s2 = scanner.nextLine();
        boolean isSubstring = s1.contains(s2);
        System.out.println("s2 არის s1-ის ქვესტრიქონი: " + isSubstring);

        // 5.
        System.out.print("შეიყვანეთ სტრიქონი: ");
        String lastCheck = scanner.nextLine().trim();
        if (!lastCheck.isEmpty()) {
            char lastChar = Character.toLowerCase(lastCheck.charAt(lastCheck.length() - 1));
            if ("aeiouAEIOUაბგდევზთიკლმნოპჟრსტუფქღყშჩცძწჭხჯჰ".indexOf(lastChar) != -1) {
                System.out.println("სტრიქონი მთავრდება ხმოვნით.");
            } else {
                System.out.println("სტრიქონი მთავრდება თანხმოვნით.");
            }
        } else {
            System.out.println("ცარიელი სტრიქონი!");
        }

        // 6
        System.out.print("შეიყვანეთ შეცვლილი სიტყვა: ");
        String modifiedWord = scanner.nextLine();
        StringBuilder originalWord = new StringBuilder();
        for (int i = 0; i < modifiedWord.length(); i++) {
            if (i == 0 || modifiedWord.charAt(i) != modifiedWord.charAt(i - 1)) {
                originalWord.append(modifiedWord.charAt(i));
            }
        }
        System.out.println("თავდაპირველი სიტყვა: " + originalWord);

        // 7
        System.out.print("შეიყვანეთ სიტყვა: ");
        String longWord = scanner.nextLine();
        if (longWord.length() > 10) {
            String abbreviation = longWord.charAt(0) + String.valueOf(longWord.length() - 2) + longWord.charAt(longWord.length() - 1);
            System.out.println("სიტყვა უზარმაზარია, " + abbreviation);
        } else {
            System.out.println("სიტყვა არ არის უზარმაზარი.");
        }

        scanner.close();
    }
}
