import java.util.Scanner;

public class PeacefulParty {
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
            getMAx(is);
        }
    }
    public static void getMAx(int arr[])
    {
        if((arr[0]+arr[2])>arr[1])
        {
            System.out.println((arr[0]+arr[2]));
        }
        else
        {
            System.out.println(arr[1]);
        }
    }
}
