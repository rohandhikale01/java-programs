import java.util.Scanner;
public class factors_of_num {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num=in.nextInt();

        System.out.println("Factors: ");
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(" "+i); 

            }
        }

    }
    
}
