import java.util.*;
public class ASum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            boolean flag = false;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a+b == c)
            {
                 flag = true;
            }
            else if(a+c == b)
            {
                flag = true;
            }
            else if(b+c == a)
            {
                flag = true;
            }
            else
            {
                flag = false;
            }
            if(flag)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}