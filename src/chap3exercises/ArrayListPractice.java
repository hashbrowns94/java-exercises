package chap3exercises;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(42, 11, 98, 65, 3, 25, 78, 64, 58, 23));
        ArrayList<String> nouns = new ArrayList<String>(Arrays.asList("boat", "pewter", "moss", "clone", "elves"));
        System.out.println(AddEven.addNums(num));
        System.out.println(WordCounter.counter(nouns));
    }
}
