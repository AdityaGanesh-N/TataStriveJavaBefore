import java.util.Scanner;

public class Prime1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, j, n, count;
       System.out.println("Enter a Number: ");
        n = s.nextInt();
        for(i=2; i<=n; i++){
            count = 0;
            for(j=2; j<=i/2; j++)
            {
                if(i%j==0){
                    count=1;
                    break;
                }
            }
            if(count==0){
                //System.out.println("The Prime Numbers are: ");
                System.out.println(i);

            }
        }
    }
}
