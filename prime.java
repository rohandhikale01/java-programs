import java.util.Scanner;
public class prime {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        int num,count=0;

        System.out.print("Enter the number: ");
        num=scan.nextInt();

        for(int i=2;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count==1)
        {
            System.out.printf("Number %d is prime",num);
        }
        else
        {
            System.out.printf("Number %d is not a prime",num);
        }
    }
    
}
