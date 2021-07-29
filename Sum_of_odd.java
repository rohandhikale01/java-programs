import java.util.Scanner;
public class Sum_of_odd{
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);

        System.out.print("How many numbers do you want to enter: ");
        int size=s.nextInt();
        int sum=0;

        int arr[]=new int[size];

        System.out.print("Start Entering Numbers: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
            if(arr[i]%2!=0)
            {
                sum=sum+arr[i];
            }

        }
        System.out.print("Sum of odd numbers: "+sum);

    }

}