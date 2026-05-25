import java.util.Scanner;
public class ANearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String s = Long.toString(n);
        for (char c : s.toCharArray()) {
            if (c == '4' || c == '7') {
                continue;
            } else {
                if(s.length()!=4 && s.length() != 7) {
                    System.out.println("NO");
                    return;
                }
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}