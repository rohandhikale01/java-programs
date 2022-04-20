import java.util.Scanner;

public class JengaNight {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();

        int arr[][]=new  int[size][2];

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }

        for (int[] is : arr) {
            
            if(is[1]%is[0]==0)
            System.out.println("YES");
            else
            System.out.println("NO");
        }

    }
}
