import java.util.Scanner;

public class GroupAssignment {
    
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

    int j=0;
    for(int i[]:arr)
    {
        System.out.println((2*arr[j][0]+1)-arr[j][1]);
        j++;
    }
}
}
