import java.util.Scanner;

public class squaresIntheRange
{
    public static void main(String[] args) {
       
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the Left Limit of Your Range: ");
        int num1=scan.nextInt();

        System.out.print("Enter the Right Limit of Your Range: ");
        int num2=scan.nextInt();

        int count=0;

        for(int i=0;i<=num2;i++)
        {
            if(i*i>=num1&&i*i<=num2)
            count++;
        }

        System.out.println("Squares Between "+num1+" & "+num2+" are: "+count);
    }

}