import java.util.Scanner;

public class starprint1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int col = 2;          // number of stars
        int sp = n - 2;       // starting spaces
        int m = n / 2;

        for (int k = 0; k < m; k++) {

            // print each row twice
            for (int i = 0; i < 2; i++) {

                // leading spaces
                for (int l = 0; l < sp; l++) {
                    System.out.print(" ");
                }

                // stars
                for (int j = 0; j < col; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }

            col += 2;   // increase stars
            sp -= 2;    // decrease spaces
        }
    }
}