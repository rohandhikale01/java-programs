import java.util.Scanner;

public class SharkTank {
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
            getBestOffer(is);
        }
    }

    public static void getBestOffer(int arr[])
    {
        if(arr[0]*10==arr[1]*5)
        {
            System.out.println("Any");
        }
        else if(arr[0]*10<arr[1]*5)
        {
            System.out.println("Second");

        }
        else 
        {
            System.out.println("First");

        }
    }
}
