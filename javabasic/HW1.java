import java.util.Scanner;
public class HW1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = 1;
      int len = 1;
      for(int i=1;i<n/2+1;i++)
      {
        for(int j=1;j<n+1-i;j++)
        {
                System.out.print(" " + " ");       
        }
        for(int j=0;j<m;j++)
        {
          if(j==0 || j==m-1 || j==m/2)
          {
                System.out.print("*" + " ");     
          }  
          else
          {
                System.out.print(" " + " ");     
          }
          
        }
        m+=2;
        System.out.println();
  }
  
  for(int sp=1;sp<=n/2+1;sp++)
        {
          System.out.print(" " + " ");
        }

  for(int a=1;a<n-1;a++)
        {
          System.out.print("*" + " ");
        }
         for(int i=1;i<n/2+1;i++)
      {
        for(int j=n-i;j>=1;j--)
        {
                System.out.print(" " + " ");       
        }
        for(int j=0;j<m;j++)
        {
          if(j==0 || j==m-1 || j==m/2)
          {
                System.out.print("*" + " ");     
          }  
          else
          {
                System.out.print(" " + " ");     
          }
          
        }
        m-=2;
        System.out.println();
  }
  
}
}