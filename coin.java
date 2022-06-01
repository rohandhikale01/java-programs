//code chef
import java.util.Scanner;

public class coin
{
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();

        int arr[][]=new int[size][3];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<3;j++)
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
        System.out.println((arr[0]*5+arr[1]*10)/arr[2]);
    }
}