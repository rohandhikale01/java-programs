import java.util.Scanner;

public class Divisiblity {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();

        int num=0;

        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
            int last=arr[i]%10;
            num=num*10+last;
        }

       

        if(num%10==0)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
