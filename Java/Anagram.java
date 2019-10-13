import java.util.Arrays;
import java.util.Scanner;

public class Anagram
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word one: ");
        String word1 = scanner.nextLine();
        word1 = word1.toLowerCase();
        System.out.println("Enter word two: ");
        String word2 = scanner.nextLine();
        word2 = word2.toLowerCase();

        char charArray1[] = word1.toCharArray();
        char charArray2[] = word2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        String ordered1 = new String(charArray1);
        String ordered2 = new String(charArray2);

        if (ordered1.equals(ordered2)) {
            System.out.println(word1 + " and " + word2 + " are anagrams");
        }
        else {
            System.out.println(word1 + " and " + word2 + " are NOT anagrams");
        }
    }
}