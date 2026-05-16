import java.util.Scanner;
public class divideby5and11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        if(x % 5 == 0 && x % 11 == 0){
            System.out.println("Divisible by both 5 and 11");
        }
        else{
            System.out.println("Not Divisible by both 5 and 11");
        }
    }
    
}
