import java.util.Scanner;

public class BrokenTelephone {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int ans[]=new int[size];

        for(int i=0;i<size;i++)
        {
            int temp=scan.nextInt();
            int arr[]=new int[temp];
            for(int j=0;j<temp;j++)
            {
                arr[j]=scan.nextInt();
            }
            ans[i]=getWrongPass(arr);
        }

        for (int i : ans) {
            System.out.println(i);
        }
    }

    public static int getWrongPass(int arr[])
    {
        int count=0,j=-1;
        for(int i=1;i<arr.length;i++)
        {
            if((arr[i]!=arr[i-1]))
            {
                if(j!=i-1)
                {
                    count+=2;
                }
                else
                {
                    count+=1;
                }
                j=i;

            }
        }
        return count;
    }

    
}
