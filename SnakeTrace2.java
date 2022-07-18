import java.util.Scanner;

public class SnakeTrace2 {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        int row=scan.nextInt();
        int col=scan.nextInt();

        int arr[][]=new int[row][col];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }

        int j=0;
        for(int i=0;i<row;i++)
        {
            while(j>=0&&j<col)
            {

                System.out.println(arr[i][j]);
                if(i%2==0)
                j++;
                else
                j--;
            }
            if(i%2==0)
            j=col-1;
            else
            j=0;

        }
    }
}
