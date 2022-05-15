import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class waterCapacity {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[][]=new int[size][4];

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }

        for (int[] is : arr) {
            getUpdate(is);
        }
    }

    public static void getUpdate(int arr[])
    {
        int total=arr[0]+arr[2]*arr[3];
        if(total>arr[1])
        System.out.println("overFlow");
        else if(total<arr[1])
        System.out.println("Unfilled");
        else 
        System.out.println("filled");
    }
}
