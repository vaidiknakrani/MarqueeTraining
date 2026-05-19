import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k=n;
      for(int i=1;i<n+2;i++)
      {
        for(int j=1;j<(n-i+3);j++)
        {
                System.out.print((char)('A'+k)+" ");       
        }
        k--;
        System.out.println();
      }
    }
}
