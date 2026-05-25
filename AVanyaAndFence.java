import java.util.Scanner;
public class AVanyaAndFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        int h = sc.nextInt();

        while(n-- > 0) {
            int ai = sc.nextInt();
            if (ai > h) {
                sum += 2;
            } else {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}