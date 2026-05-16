import java.util.Scanner;
public class positive {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x > 0){
        System.out.println("positive");
        if(x%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
     else if(x < 0){
        System.out.println("negative");
    }
     else{
        System.out.println("zero");
    }
}
}
