import java.util.Scanner;

public class FirstLast {
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
            ans[i]=getMaxSum(arr);
        }

        for (int i : ans) {
            System.out.println(i);
        }


    }

    public static int getMaxSum(int arr[])
    {
        
        int max=arr[0]+arr[arr.length-1];
        int i=arr.length-1;
        int j=arr.length-2;
        
        while(i!=0&&(j!=(-1)))
        {
            int temp=arr[i]+arr[j];
            if(max<temp)
            max=temp;

            i--;
            j--;
        }

        return max;
    }
}
