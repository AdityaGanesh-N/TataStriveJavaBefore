import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        /*int Sum=0;
        for(int i=0; i<=100; i++){
            Sum = Sum+i;
            System.out.println(Sum);
        }
        System.out.println(Sum);*/
        int sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of numbers to be calculate:");
        int n = s.nextShort();
        for (int i=0; i<n; i++){
            System.out.println("enter the numbers");
            int z = s.nextInt();
            sum = sum + z;
            System.out.println(sum);
        }
    }
}
