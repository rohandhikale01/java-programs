import java.util.Scanner;

public class PlayingWithMatches {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
       int size=scan.nextInt();
       int arr[][]=new int[size][2];

        
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }

        for (int[] is : arr) {
            getCount(is);
        }
    }

    public static void getCount(int arr[])
    {
        int sum=arr[0]+arr[1];
        int totalCount=0;
       int myarr[]={6,2,5,5,4,5,6,3,7,6};

       while(sum>0)
       {
           int temp=sum%10;
           totalCount+=myarr[temp];
           sum=sum/10;
       }
       System.out.println(totalCount);

    }
}
