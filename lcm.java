import java.util.Scanner;
public class lcm {
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);

        int num1,num2,gcd,lcm;
        System.out.print("Enter first number: ");
        num1=scan.nextInt();

        System.out.print("Enter Second number: ");
        num2=scan.nextInt();

       for(int i=num1;i<=(num1*num2);i++)
       {
           if(i%num1==0&&i%num2==0)
           {
               System.out.println("LCM: "+i);
               break;
           }
       }


    }
    
}
