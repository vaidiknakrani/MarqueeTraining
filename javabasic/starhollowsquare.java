import java.util.Scanner;
public class starhollowsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Size of the square
        int size = sc.nextInt(); // Read the size from user input
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}