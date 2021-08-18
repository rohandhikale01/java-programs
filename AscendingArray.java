import java.util.Scanner;

import java.util.Scanner;
public class AscendingArray {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("How many Elements in your array: ");
        int size=in.nextInt();

        int arr[]=new int[size];
        System.out.println("Start Entering Numbers:  ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }

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

        System.out.print("Acsending Numbers:  ");

        for(int i=0;i<arr.length;i++)
        {
        System.out.print("  "+arr[i]);


        }

        
    }
    
}
