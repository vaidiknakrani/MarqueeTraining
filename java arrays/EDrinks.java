import java.util.*;
public class EDrinks
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = t;
        int sum = 0;
        while(t-- > 0)
        {
            int a = sc.nextInt();
            sum += a;
        }
        double ans = sum / (double) n;
        System.out.printf("%.12f", ans);

    }
}