import java.util.Scanner;

public class CarOrBus {
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

        for(int a[]:arr)
        {
            CarOrBus(a);
        }
    }

    public static void CarOrBus(int arr[])
    {
        if(arr[0]<arr[1])
        {
            System.out.println("BIKE");
        }
        else if(arr[0]>arr[1])
        {
            System.out.println("CAR");
        } else 
        {
            System.out.println("SAME");
        }
    }
}