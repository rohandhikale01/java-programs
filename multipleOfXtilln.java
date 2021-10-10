import java.util.Scanner;

public class multipleOfXtilln {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);  

        System.out.print("Enter the number whose Multiples you want to find: ");
        int num1=scan.nextInt();

        System.out.print("How many Multiples Do you want to find: ");
        int tillN=scan.nextInt();

        scan.close();

        System.out.println("The first "+tillN+" Multiples of "+num1+" are: ");

        for(int i=1;i<=tillN;i++)
        {
            System.out.print(" "+i*num1);
        }

    }
  
}