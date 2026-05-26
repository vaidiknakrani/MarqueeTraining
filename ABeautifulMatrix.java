import java.util.*;
public class ABeautifulMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = 0;
        int col = 0;

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                int num = sc.nextInt();

                if(num == 1) {
                    row = i;
                    col = j;
                }
            }
        }

        int moves = Math.abs(2 - row) + Math.abs(2 - col);

        System.out.println(moves);
    }
}