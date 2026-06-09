import java.util.*;

public class FShaassAndOskols {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        while (m-- > 0) {

            int x = sc.nextInt(); // wire number
            int y = sc.nextInt(); // bird position

            x--; // convert to 0-based index

            int left = y - 1;
            int right = arr[x] - y;

            // move left birds to upper wire
            if (x > 0) {
                arr[x - 1] += left;
            }

            // move right birds to lower wire
            if (x < n - 1) {
                arr[x + 1] += right;
            }

            // current wire becomes empty
            arr[x] = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}