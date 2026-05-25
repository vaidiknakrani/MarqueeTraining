import java.util.Scanner;
public class ATram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        int max = 0;

        while (n-- > 0) {
            int ai = sc.nextInt();
            int bi = sc.nextInt();

            p -= ai;
            p += bi;

            max = Math.max(max, p);
        }
        System.out.println(max);
    }
}