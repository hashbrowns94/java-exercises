package chap3exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCounter {
    public static ArrayList<String> counter(ArrayList<String> words){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word length you'd like to search for: ");
        int length = input.nextInt();
        ArrayList<String> fivers = new ArrayList<>();
        for(String word : words) {
            if (word.length() == length) {
                fivers.add(word);
            }
        }
        return fivers;
    }
}
