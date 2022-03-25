import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        
        System.out.println("How many Numbers Do You have: ");
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter The Numbers(Non-Decreasing Order): ");

        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }

        System.out.println("Enter The Number To be Search: ");
        int key=scan.nextInt();
        int low=0,high=(size-1),mid=0,count=0;;


        while(low<=high)
        {
            count++;
         mid=(int)(low+high)/2;
            if(key<arr[mid])
            {
                high=(mid-1);
            }
            else if(key>arr[mid])
            {
                low=mid+1;
            }
            else 
            {
                System.out.println("Number Found Successfully at: "+mid);
                System.out.println("Steps required: "+count);
                return;
            }
        }
        System.out.println("Steps required: "+count);

        System.out.println("Number Not Found");
    }

    
}
