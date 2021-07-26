import java.util.Scanner;
public class Count_divisior {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

        System.out.print("Enter min num & max num: ");
        int l=in.nextInt();
        int r=in.nextInt();

        System.out.print("Enter the number by which you want to divide: ");
        int k=in.nextInt();

        int count=0;

        for(int i=l;i<=r;i++)
        {
            if(i%k==0)
            {
                count++;
            }
        }
        System.out.println(count);

    }
    
}
