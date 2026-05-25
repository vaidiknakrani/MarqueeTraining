import java.util.*;

public class BAbsoluteCinema {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            long[] a = new long[n];
            long[] b = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
            }

            long sum = 0;
            long mx = 0;

            for (int i = 0; i < n; i++) {

                long big = Math.max(a[i], b[i]);
                long small = Math.min(a[i], b[i]);

                sum += small;
                mx = Math.max(mx, big);
            }

            System.out.println(sum + mx);
        }

        sc.close();
    }
}