import java.util.*;
public class twodarray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j] = sc.nextInt();
                mx = Math.max(mx,arr[i][j]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Max element is " + mx);
        
        for (int i = 0; i < arr.length; i++) {
            int sumrow = 0;
            for(int j=0;j<arr[0].length;j++)
            {
                sumrow += arr[i][j];
                
            }
            System.out.print("ith row sum is " + sumrow);
            System.out.println();
        }
         for (int i = 0; i < arr[0].length; i++) {
            int sumcol = 0;
            for(int j=0;j<arr.length;j++)
            {
                sumcol += arr[j][i];
                
            }
            System.out.print("jth col sum is " + sumcol);
            System.out.println();
        }
         int sumdia = 0;
         for (int i = 0; i < arr[0].length; i++) {

            for(int j=0;j<arr.length;j++)
            {
                if(i==j)
                {
                sumdia += arr[j][i];
                }
                
            }
            
        }
        System.out.print("primary diagonal sum is " + sumdia);
        System.out.println();
        int sumdias = 0;
         for (int i = 1; i <= arr[0].length; i++) {

            for(int j=1;j<=arr.length;j++)
            {
                if(i+j == n+1)
                {
                sumdias += arr[i-1][j-1];
                }
                
            }
            
        }
        System.out.print("secondary diagonal sum is " + sumdias);
        System.out.println();

        

    }
}