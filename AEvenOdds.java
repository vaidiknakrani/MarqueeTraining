import java.util.*;

public class AEvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();

        long odd = (n + 1) / 2;

        // If k is in odd numbers part
        if (k <= odd) {
            System.out.println(2 * k - 1);
        }
        // Otherwise in even numbers part
        else {
            System.out.println(2 * (k - odd));
        }
    }
}