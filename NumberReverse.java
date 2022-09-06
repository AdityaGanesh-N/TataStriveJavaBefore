import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num= s.nextInt();
        int rev=0, rem = 0;
        while(num!=0){
            rem = num%10;
            rev = rev*10+rem;
            num= num/10;
        }
        System.out.println("The reverse of Number is "+rev);
    }
}
