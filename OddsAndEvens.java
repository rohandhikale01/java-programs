import java.util.Scanner;

public class OddsAndEvens {
    
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
            if((arr[i][0]+arr[i][1])%2==0)
            {
                System.out.println("Bob");
            }
            else
            {
                System.out.println("Alice");
            }
        }
    }
}
