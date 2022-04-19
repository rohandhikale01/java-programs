import java.util.Scanner;

public class chessFormat
{
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
            getAns(is);
        }
    }

    public static void getAns(int arr[])
    {
        int ans=arr[0]+arr[1];
        if(ans<3)
        {
            System.out.println("1");
        }
        if(ans>=3&&ans<=10)
        {
            System.out.println("2");
        }  if(ans>=11&&ans<=60)
        {
            System.out.println("3");
        }  if(ans>60)
        {
            System.out.println("4");
        }
    }
}