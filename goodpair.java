import java.util.Scanner;

public class goodpair {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int ans[]=new int[size];

        for(int i=0;i<size;i++)
        {
            int key=scan.nextInt();
            int arr1[]=new int[key];
            int arr2[]=new int[key];
            for(int j=0;j<key;j++)
            {
                arr1[j]=scan.nextInt();
            }
            for(int j=0;j<key;j++)
            {
                arr2[j]=scan.nextInt();
            }
            ans[i]=getCount(arr1, arr2);

        }
        for (int i : ans) {
            System.out.println(i);
        }

    }

    public static int getCount(int arr1[],int arr2[])
    {
        int count=0;
        for(int i=0;i<arr1.length-1;i++)
        {
            for(int j=i+1;j<arr2.length;j++)
            {
                if((arr1[i]==arr2[j])&&(arr1[j]==arr2[i]))
                count++;
            }
        }

        return count;
    }
}
