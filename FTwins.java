import java.util.*;
public class FTwins
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
             arr[i] = sc.nextInt();   
        }
        Arrays.sort(arr);
        int msum = 0;
        for(int i=0;i<n;i++)
        {
             msum += arr[i];  
        }
        int sum = 0;
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
        sum += arr[i];
        count++;
          if (sum > msum - sum) break;
}
        System.out.println(count);
    }
}