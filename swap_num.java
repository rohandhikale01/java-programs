import java.util.Scanner;
public class swap_num {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1=s.nextInt();

        System.out.print("Enter the Second number: ");
        int num2=s.nextInt();

        num1=num1-num2;
        num2=num1+num2;
        num1=num2-num1;

        System.out.println("Number after Swapping: ");
        System.out.println("The first number: "+num1);
        System.out.println("The Second number: "+num2);
    }
    
}
