import java.util.Scanner;

public class ChessMatch {
    
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

        for(int i=0;i<size;i++)
        {
            System.out.println((2*(arr[i][0]+180))-(arr[i][1]+arr[i][2]));
        }
    }
}
