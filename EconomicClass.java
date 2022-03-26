import java.util.Scanner;

public class EconomicClass {
    
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
        int ans[]=new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
            int arr1[][]=new int[2][arr[i]];
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<arr[i];k++)
                {
                    arr1[j][k]=scan.nextInt();
                }
                ans[i]=getCount(arr1);
            }
        }
        for (int i : ans) {
            System.out.println(i);
        }
    }

    public  static int getCount(int arr[][])
    {
        int count=0;
        for(int i=0;i<arr[0].length;i++)
        {
            if(arr[0][i]==arr[1][i])
            {
                count++;
            }
        }
        return count;

    }
}
