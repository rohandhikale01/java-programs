import java.util.Scanner;
//code from codecheff

public class TheThreeTopics {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[4];
        for(int i=0;i<4;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            if(arr[i]==arr[3])
            {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
