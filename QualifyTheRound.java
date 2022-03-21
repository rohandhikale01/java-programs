import java.util.Scanner;

public class QualifyTheRound {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        int size=scan.nextInt();

        int arr[][]=new int[size][3];

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }

        for(int i[]:arr)
        {
            isQualify(i);
        }
    }

    public static void isQualify(int arr[])
    {
        if(arr[0]<=(arr[1]*1+arr[2]*2))
        {
            System.out.println("Qualify");
        }
        else
        {
            System.out.println("NotQualify");
        }
    }
}
