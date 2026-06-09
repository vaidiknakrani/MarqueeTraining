import java.util.*;
public class GCookies
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        int evenSum = 0;
        int oddSum = 0;
        while(n-- > 0)
        {
            int a = sc.nextInt();
            if(a%2 == 0)
            {
                  evenSum += a;
                  evenCount ++;
            }
            else
            {
                 oddSum += a;
                 oddCount ++;
            }
            
        }
        if((evenSum + oddSum) % 2==0)
            {
                System.out.print(evenCount);
            }
            else{
                System.out.print(oddCount);
            }
    }
}