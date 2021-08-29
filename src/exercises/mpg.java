package exercises;
import java.util.Scanner;

public class mpg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have your driven?");
        int miles = input.nextInt();

        System.out.println("How many gallons of gas have you used?");
        int gallons = input.nextInt();

        System.out.println("You car gets " + miles / gallons + " to the gallon");
    }
}
