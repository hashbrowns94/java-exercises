package chap3exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args){
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newStudent;
        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {
            System.out.print("ID: ");
            newStudent = input.nextInt();

            if (!newStudent.equals("")) {
                System.out.print("Name: ");
                String newName = input.nextLine();
                students.put(newStudent, newName);

                // Read in the newline before looping back
                input.nextLine();
            }
        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
            //sum += student.getValue();
        }

    }
}
