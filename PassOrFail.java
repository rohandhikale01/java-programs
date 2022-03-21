import java.util.Scanner;

public class PassOrFail {
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

    for(int i=0;i<size;i++)
    {
        isPass(arr[i][0], arr[i][1],arr[i][2]);
    }
 }
 
 public static void isPass(int Q,int C,int P)
 {
        if(P<=(C*3)-(Q-C))
        {
                System.out.println("PASS");
        }
        else 
        {
            System.out.println("FAIL");
        }

 }
}
