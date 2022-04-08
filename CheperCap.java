import java.util.Scanner;

public class CheperCap {
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
            isCheper(is[0], is[1]);
        }
      
    }

    public static void isCheper(int p1,int p2)
    {
        
        if(p1>p2)
        System.out.println("second");
        else 
        if(p1<p2)
        System.out.println("first");
        else 
        System.out.println("Any");
    }
}
