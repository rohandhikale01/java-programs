//code chef
import java.util.Scanner;

public class SubTaskProblem {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int ans[]=new int[size];

        for(int i=0;i<size;i++)
        {
            int newSize=scan.nextInt();
            int M=scan.nextInt();
            int K=scan.nextInt();
            int arr[]=new int[newSize];

            for(int j=0;j<newSize;j++)
            {
                arr[j]=scan.nextInt();
            }
            ans[i]=getPoints(arr, M, K);
        }

        for (int i : ans) {
            System.out.println(i);
        }
    }

    public static int getPoints(int arr[],int M,int K)
    {
        int countTotal=0;
        int countM=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            countTotal++;

            if(i<M&&arr[i]==1)
            countM++;
        }

    
        if(countTotal==arr.length)
        return 100;
        else if(countM==M)
        return K;
        else
        return 0;
    }
}
