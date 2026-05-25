import java.util.*;

public class C1WeBeFlippingEasyVersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            
            ArrayList<Integer> operations = new ArrayList<>();
            int flipCount = 0; // Tracks parity of flips applied to current position
            
            // Process from right to left
            for (int i = n - 1; i >= 0; i--) {
                // Current effective value after all flips
                long currentValue = (flipCount % 2 == 0) ? a[i] : -a[i];
                
                // If positive, we need to flip to make it negative
                if (currentValue > 0) {
                    operations.add(i + 1); // 1-indexed
                    flipCount++;
                }
            }
            
            // Output
            StringBuilder sb = new StringBuilder();
            sb.append(operations.size()).append("\n");
            if (!operations.isEmpty()) {
                for (int i = 0; i < operations.size(); i++) {
                    if (i > 0) sb.append(" ");
                    sb.append(operations.get(i));
                }
                sb.append("\n");
            }
            System.out.print(sb);
        }
    }
}
