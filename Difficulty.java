import java.util.Scanner;

public class Difficulty {
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
            ans[i]=getCount(arr);
        }
        for (int i : ans) {
            System.out.println(i);
        }
    }

    public static int getCount(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=1000)
            count++;
        }
        return count;
    }
}
