import java.util.Scanner;

//code chef
public class TimePenalty {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();

        int arr[][]=new int[size][4];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<4;j++)
            {
            arr[i][j]=scan.nextInt();

            }
        }

        for (int[] is : arr) {
            getWinner(is);
        }
    }

    public static void getWinner(int arr[])
    {
        int penalty1,penalty2;
        if(arr[0]>arr[1])
        penalty1=arr[0];
        else
        penalty1=arr[1];


        if(arr[2]>arr[3])
        penalty2=arr[2];
        else
        penalty2=arr[3];


        if(penalty1>penalty2)
        System.out.println("Q");
        else if(penalty1<penalty2)
        System.out.println("P");
        else
        System.out.println("Tie");

    }
}
