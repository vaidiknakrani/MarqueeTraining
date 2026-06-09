import java.util.*;
public class BGeorgeAndAccommodation
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        while(t-- > 0)
        {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int ans = q-p;
            if(ans >= 2)
            {
                count++;
            }
        }
        System.out.print(count);
    }
}