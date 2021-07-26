import java.util.Scanner;
public class Decimal_to_binary {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the Decimal number which you want to covert as Binary: ");
        int num=in.nextInt();

        int a[]=new int[100];

        int x=0;

        for(int i=0;num>0;i++)
        {
            a[i]=num%2;
            num=num/2;
            x++;
        }

        System.out.print("Binary Number: ");
        for(int i=(x-1);i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
