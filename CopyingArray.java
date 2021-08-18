import java.util.Scanner;

public class CopyingArray{

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

        System.out.print("How Many Elements In your Array: ");
        int size=in.nextInt();

        int arr1[]=new int[size];

        System.out.print("Start Entering Elements: ");

        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=in.nextInt();
        }

        in.close();

        int arr2[]=new int[size];
        //copying array
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=arr1[i];
        }

        System.out.print("Array After Copying: ");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }


    }

}