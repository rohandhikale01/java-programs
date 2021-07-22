import java.util.Scanner;
public class factorial {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num=in.nextInt();
        long fact=1;

        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }

        System.out.print("Factorial: "+fact);

    }
    
}
