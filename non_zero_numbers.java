import java.util.Scanner;
public class non_zero_numbers
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);

        System.out.print("How many numbers do you want to insert: ");
        int size=scan.nextInt(); //to find the size of array // 

        int count=0; //to count non-zero elements of an array// 

        int arr[]=new int[size];

        System.out.print("Start Entering the numbers: ");

        for(int i=0;i<size;i++) //
        {
            arr[i]=scan.nextInt();
           
            if(arr[i]!=0)
            {
                count++;
            }
        } //closing of for loop//
        scan.close();

        System.out.println("Number of non-zero Elements is:  "+count);   
    } //closing of main method //

} //closing of public class//