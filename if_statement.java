import java.util.Scanner;
public class if_statement {

    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int a=0;

        System.out.println("Enter the number: ");
         a=input.nextInt();

         //int b=(int)(a%2);
         //System.out.println("Value of a=" +a);
         if(a%2==0)
         {
             System.out.println("Number is Even");
         }
         else
         {
             System.out.println("Number is odd");
         }
    }
    
}
