import java.util.Scanner;

public class BestCoupen {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }
        for (int i : arr) {
            getMAxDiscount(i);
        }
    }

    public static void getMAxDiscount(float amt)
    {
        float dis=(float)(amt/10.0);

        if(dis>100)
        {
            System.out.println((int)(dis));
        }
        else
        {
            System.out.println(100);
        }
    }
}
