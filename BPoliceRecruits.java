import java.util.*;
public class BPoliceRecruits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsum = 0,psum = 0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
              if(arr[i]>0)
              {
                   continue;
              }
              if(arr[i] < 0)
              {
                nsum += 1;
              }
              else
              {
                psum += arr[i];
              }
        }
        int ans = Math.abs(nsum-psum);
        System.out.print(ans);
    }
}