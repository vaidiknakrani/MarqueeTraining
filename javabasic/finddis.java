import java.util.*;
public class finddis
{
    public static int find(int[] arr,int x,int i)
    {
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==x)
            {
                return Math.abs(i-j);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i] = sc.nextInt();
       }
        //  for(int i=0;i<n;i++)
        //  {
        //     int x = arr[i];
        //     if(arr[i]==x)
        //     {
        //         int ans = find(arr,x,i);

        //         if(ans>=max)
        //         {
        //             max = ans;
        //         }
        //     }
        //     }
        //     if(max==Integer.MIN_VALUE)
        //     {
        //         System.out.println(-1);
        //     }
        //     else
        //     {
        //         System.out.println(max);        
        //  }
        int[] brr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(brr);
        for(int i=0;i<n-1;i++)
        {
            if(brr[i]==brr[i+1])
            {
                int a = arr[i];
                int b = arr[i+1];
                int ans = Math.abs(i-(i+1));
                if(ans>=max)
                {
                    max = ans;
                }
            }
        }
        if(max == Integer.MIN_VALUE)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(max);
        }
    }
}
