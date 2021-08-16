import java.util.Scanner;

public class IndexOfNumInSortedArray
{
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

        System.out.print("How many Elements in Your Array: ");
        int size=in.nextInt();

        System.out.print("Start Entering Numbers: ");
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }

        System.out.print("Enter the number which you want to Search: ");
        int numSearch=in.nextInt();

       in.close();;

         //sorting of array
         int key=0,temp=0;
         for(int i=0;i<arr.length;i++)
         {
             key=arr[i];
             for(int j=0;j<arr.length;j++)
             {
                 if(key<arr[j])
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
            System.out.println(arr[i]+" ");
        }

        boolean isNumberExist=false;
        int index=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==numSearch);
            {
                index=i;
                isNumberExist=true;
            }
            
        }

        if(isNumberExist)
        {
            System.out.println("Index of Key number is: "+index);
        }
        else
        {
            System.out.println("Number not exist in Array");

        }


    }
}