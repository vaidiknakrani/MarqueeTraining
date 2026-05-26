public class ANearlyLuckyNumber {
    public static void main(String[] args) {
        
        String s = Long.toString(n);
        for (char c : s.toCharArray()) {
            if (c != '4' && c != '7') {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}