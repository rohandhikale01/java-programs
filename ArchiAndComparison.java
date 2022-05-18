import java.util.Scanner;

public class ArchiAndComparison {
    public static void main(String[] args) {
        
        Scanner Scan=new Scanner(System.in);
        int size=Scan.nextInt();
        long[][] arr=new long[size][3];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=Scan.nextLong();
            }
        }
        for(long i[]:arr)
        {
            getBigPow(i);
        }

    }

    public static void getBigPow(long arr[])
    {
        double pow1=Math.pow(arr[0], arr[2]);
        double pow2=Math.pow(arr[1], arr[2]);
        if(pow1>pow2)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("2");

        }

    }
}
