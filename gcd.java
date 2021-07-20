import java.util.Scanner;
public class gcd
{
    public static void main(String[] args)
     {
        
        Scanner in=new Scanner(System.in);

        int num1,num2;
        System.out.print("Enter first number: ");
        num1=in.nextInt();

        System.out.print("Enter Second number: ");
        num2=in.nextInt();

            for(int i=num1;i>=1;i--)
            {
                if(num1%i==0&&num2%i==0)
                {
                    System.out.println("GCD: "+i);
                    break;
                }
            }
    }   

}