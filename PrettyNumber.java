import java.util.Scanner;

public class PrettyNumber {
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

        for(int i=0;i<size;i++)
        {
            countPretty(arr[i][0], arr[i][1]);
        }
    }

    public static void countPretty(int low,int high)
    {
        int count=0;
        for(int i=low;i<=high;i++)
        {
            int key=(i%10);
            if(key==2||key==3||key==9)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
