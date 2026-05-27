import java.util.Scanner;

public class ALoveStory {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       sc.nextLine();
       String l = "codeforces";
       
       while(t-- > 0)
       {
           String s = sc.nextLine();
           int n = s.length();
           int count = 0;
           for(int i=0;i<n;i++)
           {
                
                 if(s.charAt(i)!=l.charAt(i))
                 {
                    count++;
                 }
           }
           System.out.println(count);
       }
    }
}