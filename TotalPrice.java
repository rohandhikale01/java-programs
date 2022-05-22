import java.util.Scanner;

public class TotalPrice {
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
            System.out.println(is[0]*10+is[1]*90);
        }

    }
}
