import java.util.Scanner;
public class Arithmetic_operation_using_switch_case {

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        float a,b;
        char x;

        System.out.print("Enter First number: ");
        a=s.nextFloat();

        System.out.print("Enter Second Number: ");
        b=s.nextFloat();

        System.out.print("Enter Arithmetic operation: ");
        x=s.next().charAt(0);

        switch (x)
        {
            case '+':System.out.println("Sum= " +(a+b));
             break;
            
            case '-':System.out.println("Subtraction= " +(a-b));
             break;

            case '*':System.out.println("Multiplication= " +(a*b));
             break;
            
            case '/':System.out.println("Division= " +(a/b));
             break;

             default:System.out.println("Enter Valid Operation. ");
             break;
        }
    }
    
}
