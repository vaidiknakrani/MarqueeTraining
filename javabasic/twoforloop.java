public class twoforloop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i+=2) {
            System.out.print(1);
            for (int j = 0; j <= 7; j+=5) {
               if((i+j) % 2 == 0){
                   break;
               } else {
                   continue;
            }
            
        }
        System.out.println(3);
    }
}
}