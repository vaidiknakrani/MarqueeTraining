import java.util.Scanner;
public class HW4 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k=n-1;
      for(int i=1;i<n+1;i++)
      {
        for(int j=1;j<i+1;j++)
        {
                System.out.print((char)('A'+k)+" ");
                k++;
        }
        k = n-i-1;
        System.out.println();
      }
    }
}