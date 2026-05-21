public class IfExample {
    int a = 5;
    static void fcn(int c) {
       int a = 10;
        System.out.print(a);
    }

    public static void main(String[] args) {
        int b = 5;
        fcn(b);
        System.out.print(b);
    }
}
