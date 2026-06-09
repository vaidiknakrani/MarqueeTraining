import java.util.*;
public class MissingCoinSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[t];
        int smx = Integer.MAX_VALUE;
        for(int i=0;i<t;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans = 1;
        for(int i=0;i<t;i++)
        {
            if(arr[i] > ans)
            {
                break;
            }
            ans += arr[i];
        }
        System.out.print(ans);
    }
}
