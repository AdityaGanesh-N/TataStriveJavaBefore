import javax.swing.*;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p,i;
        boolean Prime = true;
        System.out.print("Enter a Number: ");
        p = s.nextInt();
        if(p==0 || p==1)
            Prime=false;
        for (i=2;i<p;i++){
            if((p%i)==0){
                Prime=false;
            }
        }
    if (Prime == true)
        System.out.println(p+" is Prime Number");
    else
        System.out.println(p+" is Composite Number");
    }
}