public class lefttriangle01 {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the left triangle
        boolean flag = true;
        boolean newline = true;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(flag)
                {
                    System.out.print("0");
                    flag = false;
                }
                else
                {
                    System.out.print("1");
                    flag = true;
                }
            }
            System.out.println(); // Move to the next line after each row
        }
             
    }
}
