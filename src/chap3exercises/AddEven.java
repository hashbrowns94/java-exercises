package chap3exercises;
import java.util.ArrayList;

public class AddEven {
    public static int addNums(ArrayList<Integer> arr) {
        int total = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        return total;
    }
}
