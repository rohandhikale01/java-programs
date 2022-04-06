//Code from chef 
import java.util.Arrays;
import java.util.Scanner;

public class SqidGame {
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
            ans[i]=getPrice(arr);
            
        }

        for (int i : ans) {
            System.out.println(i);
        }
    }

    public static int getPrice(int arr[])
    {
        int Price=0;
      Arrays.sort(arr);
        for (int i : arr) {
            Price+=i;
        }
        Price-=arr[0];
       return Price;

    }
}
