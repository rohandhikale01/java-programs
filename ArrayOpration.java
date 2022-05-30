import java.util.Arrays;
import java.util.Scanner;

public class ArrayOpration {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        int size=scan.nextInt();
        
        int ans[]=new int[size];

        for(int i=0;i<size;i++)
        {
            int key=scan.nextInt();
            int arr[]=new int[key];
            for(int j=0;j<key;j++)
            {
                arr[j]=scan.nextInt();
            }
            ans[i]=getAns(arr);
        }

        for (int i : ans) {
            System.out.println(i);
        }
       
    }

    public static int getAns(int arr[])
    {
        Arrays.sort(arr);
        if(arr.length>1)
        {
            int newarr[]=new int[arr.length-1];
            for(int i=0;i<newarr.length;i++)
            {
                newarr[i]=arr[i]-arr[i+1];
            }
            return getAns(newarr);
        }
        else
        {
           return Math.abs(arr[0]);     
        }
       
    }
}
