import java.util.Scanner;
public class SecondLargestElementOfArray {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
    
        System.out.print("How Many Elements Do you Want Enter: ");
        int size=in.nextInt();

        int arr[]=new int[size];
        System.out.print("Start Entering Numbers: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        in.close();

        //sorting of array
        int key=0,temp=0;
        for(int i=0;i<arr.length;i++)
        {
            key=arr[i];
            for(int j=0;j<arr.length;j++)
            {
                if(key>arr[j])
                {
                    temp=arr[j];
                    arr[j]=key;
                    arr[i]=temp;
                    key=arr[i];
                }
            }
        }
        System.out.println("Sorted Array: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);      
        }

        System.out.println("Second Largest Element: "+arr[1]);

        
    }
    
}
