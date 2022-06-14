import java.util.*;
public class chapter {
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
        
        System.out.println(is[0]*is[1]*is[2]);
    }
    }
}
