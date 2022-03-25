import java.util.Scanner;

public class CupFinal {
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

        int j=0;
        for (int[] is : arr) {
                int D=Math.abs(is[0]-is[1]);
                if(D<=is[2])
                System.out.println("YES");
                else
                System.out.println("NO");
            
            
        }
    }
}
