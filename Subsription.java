import java.util.Scanner;

public class Subsription {
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

    for (int[] is : arr) {
        getPrice(is);
    }
    }

    public static void getPrice(int arr[])
    {
        if(arr[0]%6==0)
        System.out.println((arr[0]%6)*arr[1]);
        else
        System.out.println(((arr[0]/6)+1)*arr[1]);


    }
}
