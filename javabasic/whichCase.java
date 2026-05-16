
import java.util.*;

public class whichCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         char ch = sc.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println(1);
        }
        else if(ch >= 'a' && ch <= 'z'){
            System.out.println(0);
        }
        else{
            System.out.println(-1);
        }
    }
}