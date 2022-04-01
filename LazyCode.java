import java.util.Scanner;

public class LazyCode {
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
            getTime(is);
        }
    }

    public static void getTime(int arr[])
    {
        if((arr[0]*arr[1])>(arr[0]+arr[2]))
        {
            System.out.println((arr[0]+arr[2]));
        }
        else
        {
            System.out.println((arr[0]*arr[1]));
        }
    }
}
