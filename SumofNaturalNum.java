import java.util.Scanner;
public class SumofNaturalNum {
    public static void main(String[] args) {
        int i=0, sum=0, z;
        Scanner s = new Scanner (System.in);
        int n=i+1;
        for (i=0;i<n;i++) {
            System.out.print("Enter the number: ");
            z = s.nextInt();
            sum = sum + z;
            n = i+2 ;
            System.out.println("The Sum of given numbers is: " + sum);

        }
    }
}