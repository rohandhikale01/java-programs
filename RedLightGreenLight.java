import java.util.Scanner;

//code chef
public class RedLightGreenLight {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        int size=scan.nextInt();
        int ans[]=new int[size];

        for(int i=0;i<size;i++)
        {
            int newsize=scan.nextInt();
            int key=scan.nextInt();
            
            int arr[]=new int[newsize];
            for(int j=0;j<newsize;j++)
            {
                arr[j]=scan.nextInt();
            }
            ans[i]=getCount(arr, key);
        }

        for (int i : ans) {
            System.out.println(i);
        }
    }

    public static int getCount(int arr[],int key)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>key)
            count++;
        }
        return count;
    }
}
