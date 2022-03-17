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
            isBattryLow(arr[i]);
        }
    }

    public static void isBattryLow(int bat)
    {
        if(bat<=15)
        System.out.println("YSE");
        else
        System.out.println("NO");
    }
}
