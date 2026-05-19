import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = (n/2)+1;
        int q = (n/2)-1;
        System.out.print(" ");
        for(int a=1;a<q;a++)
        {
            System.out.print("*");
        }
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(j==1 || j==m || i==(n/2))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
