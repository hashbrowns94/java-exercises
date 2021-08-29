package exercises;
import java.util.Scanner;

public class stringSearch {
    public static void main(String[] args) {
        String openingLine = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word to search: ");
        String searchTerm = input.nextLine().toLowerCase();
        input.close();
        Integer index = openingLine.indexOf(searchTerm);
        Integer length = searchTerm.length();

        if (openingLine.toLowerCase().contains(searchTerm)) {
            System.out.println("The index of this word is " + index + ", and the term is " + length + " characters long");
        } else {
            System.out.println("that word isn't in the first sentence of Alice In Wonderland");
        }
        String newOpeningLine = openingLine.replace(searchTerm, "");
        System.out.println(newOpeningLine);
    }
}
