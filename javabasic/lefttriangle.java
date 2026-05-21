public class lefttriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the left triangle

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i );
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
