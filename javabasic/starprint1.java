import java.util.Scanner;
public class starprint1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int col=2;
        int sp = (n/2 -1);
        int m = n/2;
        for(int k=0;k<m;k++){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            for(int l=0;l<sp;l++){
                System.out.print("  ");
            }
             for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        col+=2;
        }
    }
}
