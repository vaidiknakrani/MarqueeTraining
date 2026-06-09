import java.util.*;
public class AElephant
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
        if (n >= 5) { n -= 5; count++; }
        else if(n>=4){ n  -=4; count++; }
        else if(n>=3){
            n  -=3; count++;
        }
        else if(n>=2)
        {
            n  -=2; count++;
        }
        else
        {
            n -= 1; count++;
        }
     }
        System.out.print(count);
    }
}