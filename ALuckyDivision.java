import java.util.Scanner;
public class ALuckyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isLucky = true;
        int n = sc.nextInt();
        int m = n;
        while(n !=0)
        {
            int rem = n % 10;
            if(rem != 4 && rem != 7)
            {
                
                isLucky = false;
                break;
            }
            n /= 10;
        }
        if(isLucky || (m % 4 == 0 || m % 7 == 0 || m % 47 == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}