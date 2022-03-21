import java.util.Scanner;

public class SummerHeat {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        int size=scan.nextInt();

        int arr[][]=new int[size][4];

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<4;j++){
                arr[i][j]=scan.nextInt();
            }
        }

        for(int i[]:arr)
        {
            getNumberOfCoconut(i);
        }
    }

    public static void getNumberOfCoconut(int arr[])
    {
        System.out.println(arr[2]/arr[0]+arr[3]/arr[1]);
        
    }
}
