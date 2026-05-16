public class diffsumofoddandevenbet1to100 {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 2; i <= 99; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        int difference = (sumOdd - sumEven);
        System.out.println("The difference between the sum of odd and even numbers from 1 to 100 is: " + difference);
    }
}