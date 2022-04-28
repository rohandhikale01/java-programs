import java.util.*;
public class chefandbird {
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

    for (int[] is : arr) {
        getType(is);
    }
    }

    public static void getType(int arr[])
    {
        if((arr[2]%arr[0]==0)&&(arr[2]%arr[1]==0))
        {
            System.out.println("ANY");
        }
        else if(arr[2]%arr[0]==0)
        {
            System.out.println("CHICKEN");
        }
        else if(arr[2]%arr[1]==0)
        {
            System.out.println("DUCk");
        }
        else
        {
            System.out.println("None");
        }
    }
}
