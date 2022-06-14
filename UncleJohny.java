//code chef
import java.util.Arrays;
import java.util.Scanner;

public class UncleJohny {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int ans[]=new int[size];

        for(int i=0;i<size;i++)
        {
            int newSize=scan.nextInt();
            int arr[]=new int[newSize];
            for(int j=0;j<newSize;j++)
            {
                arr[j]=scan.nextInt();
            }
            int key=scan.nextInt();
            ans[i]=getPosition(arr, key);
        }

        for (int i : ans) {
            System.out.println(i);
        }
}

public static int getPosition(int arr[],int key)
{
    int temp=arr[key-1];
    Arrays.sort(arr);
    int pos=0;

    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==temp)
        {
            pos=i+1;
            break;
        }
    }
    return pos;
}
}
