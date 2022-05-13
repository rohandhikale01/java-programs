import java.util.Scanner;

public class BatteryLow {
    
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        int size=scan.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            if(arr[i]<=15)
            System.out.println("YES");
            else
            System.out.println("No");
        }
    }

   
}
