import java.util.Scanner;

public class AGeorgeAndAccommodation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int nroom = 0;

        while (t-- > 0) {

            int p = sc.nextInt();
            int q = sc.nextInt();

            if ((q - p) >= 2) {
                nroom++;
            }
        }

        System.out.println(nroom);
    }
}