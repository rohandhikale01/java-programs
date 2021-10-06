/*
 To find the value of y where y=x+x^2+x^3...x^n
 User will enter two Int numbers first is value of x & second is value of 
*/

import java.util.Scanner;
public class powerSeriesExpression {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x=scan.nextInt();
    
        System.out.print("Enter the value of n: ");
        int n=scan.nextInt();

        scan.close();

        int sum=0;

        for(int i=1;i<=n;i++)
        {
            sum=(int)(sum+Math.pow(x,i));
        }

        System.out.println("Value of power series is: "+sum);
    }
    
}
