import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.nextLine();
        System.out.println("Enter word for searching: ");
        String word = scanner.nextLine();
        String[] strings = str.split(word);
        System.out.println("Number of occurrences: " + (strings.length - 1));

    }
}
