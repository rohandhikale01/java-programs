import java.util.Scanner;
public class largest_among_3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int num1,num2,num3;

        System.out.print("Enter first number: ");
        num1=scan.nextInt();

        System.out.print("Enter Second number: ");
        num2=scan.nextInt();

        System.out.print("Enter Third number: ");
        num3=scan.nextInt();

        if(num1>=num2&&num1>=num3)
        {
            System.out.print("The largest number: "+num1);
        }
        else if(num2>=num1&&num2>=num3)
        {
            System.out.print("The largest number: "+num2);
        }
        else
        {
            System.out.print("The largest number: "+num3);
        }
        

    }
    
}
