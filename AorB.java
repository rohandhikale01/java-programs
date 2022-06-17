import java.util.Scanner;

public class AorB {
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
z
        for (int[] is : arr) {
            getBest(is);
        }
    }

    public static void getBest(int arr[])
    {
            int count1=0,count2=0;

            count1=(500-2*arr[0])+(1000-(arr[0]+arr[1])*4);
            count2=(1000-4*arr[1])+(500-(arr[0]+arr[1])*2);
            if(count1>count2)
            System.out.println(count1);
            else
            System.out.println(count2);

    }
}
