import java.util.Scanner;

public class LuckyFour {
    
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }
        for (int i : arr) {
            
            countFour(i);
        }

    }
    public static void countFour(int num)
    {
        int count=0;
        int temp=0;
        while(num>0)
        {
            temp=num%10;
            num=num/10;
            if(temp==4)
            {
                count++;
            }
            
        }
        System.out.println(count);
    }
}
