public class divisonusingfun {
    static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        try {
            int result = divide(num1, num2);
            System.out.println(num1 + " divided by " + num2 + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
