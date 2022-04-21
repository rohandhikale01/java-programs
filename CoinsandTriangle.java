import java.util.Scanner;

public class CoinsandTriangle {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        int size=scan.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }
        for (int i : arr) {
            getMaxHeight(i);
        }
    }

    public static void getMaxHeight(int coins)
    {
        int sum=0,i=1;
        while(sum<=coins)
        {
            sum+=i;
            i++;
        }
        if(sum==coins)
        {
            System.out.println(i-1);
        }
        else 
        {
            System.out.println(i-2);
        }
    }
}
