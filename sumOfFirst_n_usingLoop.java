import java.util.Scanner;
public class sumOfFirst_n_usingLoop {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

        int i,sum=0,n;

        System.out.print("Enter the number upto which you want to find the sum: ");
        n=in.nextInt();

        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }

        System.out.println("Sum of first "+n+" Numbers: "+sum);
    }
    
}
