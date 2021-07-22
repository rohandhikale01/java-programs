import java.util.Scanner;
public class perfect_num {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num=in.nextInt();
        int sum=0;

        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }

        if(num==sum)
        {
            System.out.print("The number is perfect");  
        }
        else
        {
            System.out.print("The number is not perfect"); 
        }
        
    }
}
