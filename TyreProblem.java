import java.util.Scanner;

public class TyreProblem {
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

        for (int[] i : arr) {
            
            getNoOfTyre(i);
        }

    }

    public static void getNoOfTyre(int arr[])
    {
        System.out.println(2*arr[0]+4*arr[1]);
    }
}

