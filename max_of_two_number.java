import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class max_of_two_number {

    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);

        int num1,num2;

        System.out.println("Enter first Number: ");
        num1=input.nextInt();

        System.out.println("Enter Second Number: ");
        num2=input.nextInt();

        if(num1>num2)
        {
            System.out.println("Maximum number is=" +num1);
        }
        else if(num2>num1)
        {
            System.out.println("Maximum number is = " +num2);
        }
        else 
        {
            System.out.println("The numbers are Equal");
        }
    }
    
}
