import java.util.Scanner;
public class sum_diff_even_odd {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("How many numbers do you want to Enter: ");
        int size=scan.nextInt();

         int []arr=new int[size];

        System.out.print("Start Entering Numbers: ");

        int oddSum=0,evenSum=0;

        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();

            if(arr[i]%2==0)
            {
                evenSum=evenSum+arr[i];
            }
            else
            {
                oddSum=oddSum+arr[i];
            }

        } //end of for loop

        System.out.println("Sum of Even numbers: "+evenSum);
        System.out.println("Sum of Odd Numbers: "+oddSum);
        System.out.println("The Difference between sum of odd elements & even elements: "+(evenSum-oddSum));


    } //end of main method
    
} //end of public class
