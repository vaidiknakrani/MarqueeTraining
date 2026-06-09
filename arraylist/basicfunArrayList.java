import java.util.ArrayList;
import java.util.Collections;

public class basicfunArrayList {
    public static void main(String[] args) {

        // Create an empty ArrayList
        ArrayList<String> students = new ArrayList<>();

        // Add students
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");

        // Display all students
        System.out.println("Initial List:");
        System.out.println(students);

        // Insert Eve at index 2
        students.add(2, "Eve");

        // Display updated list
        System.out.println("\nAfter inserting Eve at index 2:");
        System.out.println(students);

        // Total number of students
        System.out.println("\nTotal number of students: " + students.size());

        // Student at index 3
        System.out.println("Student at index 3: " + students.get(3));

        // Check whether Bob exists
        System.out.println("Does Bob exist? " + students.contains("Bob"));

        // Replace Charlie with Chris
        int charlieIndex = students.indexOf("Charlie");
        if (charlieIndex != -1) {
            students.set(charlieIndex, "Chris");
        }

        // Remove student at index 1
        students.remove(1);

        // Remove student named David
        students.remove("David");

        // Display updated list
        System.out.println("\nAfter replacements and removals:");
        System.out.println(students);

        // Sort in ascending order
        Collections.sort(students);

        System.out.println("\nSorted List:");
        System.out.println(students);

        // Reverse the list
        Collections.reverse(students);

        System.out.println("\nReversed List:");
        System.out.println(students);

        // Find index of Chris
        System.out.println("\nIndex of Chris: " + students.indexOf("Chris"));

        // Create second ArrayList
        ArrayList<String> students2 = new ArrayList<>();
        students2.add("Tom");
        students2.add("Jerry");

        // Add all elements of second list to first list
        students.addAll(students2);

        // Display final list
        System.out.println("\nFinal List:");
        System.out.println(students);

        // Check if list is empty
        System.out.println("\nIs list empty? " + students.isEmpty());

        // Clear the list
        students.clear();

        // Verify list is empty and display size
        System.out.println("\nAfter clearing:");
        System.out.println("Is list empty? " + students.isEmpty());
        System.out.println("Size of list: " + students.size());
    }
}