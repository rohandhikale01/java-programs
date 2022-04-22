import java.util.Scanner;

public class SixFriends {
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
            getMinCost(is);
        }
    }

    public static void getMinCost(int arr[])
    {
        if(arr[0]*3<arr[1]*2)
        {
            System.out.println(arr[0]*3);
        }
        else
        {
            System.out.println(arr[1]*2);
        }
    }
}
