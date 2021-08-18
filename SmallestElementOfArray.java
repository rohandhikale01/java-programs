import java.util.Scanner;
public class SmallestElementOfArray {
    

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

        System.out.print("How many Elements in your Array: ");
        int size=in.nextInt();

        int arr[]=new int [size];

        System.out.print("Start Entering of Numbers: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        in.close();
        
        int key=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(key>arr[i])
            {
                key=arr[i];
            }
        }
        System.out.print("Smallest Number is: "+key);
    }
}
