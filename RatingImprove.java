import java.util.Scanner;

//code chef
public class RatingImprove {
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
            isImproved(is);
            
        }
    }

    public static void isImproved(int arr[])
    {
        if((arr[1]<=arr[0]+200)&&(arr[1]<arr[0]))
        System.out.println("YES");
        else
        System.out.println("NO");

    }
}
