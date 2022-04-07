import java.util.Scanner;

public class MinimumCars {
    
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        int size=scan.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }
        for (int i : arr) {
            
            if(i%4==0)
            System.out.println(i/4);
            else
            System.out.println((i/4)+1);
        }
    }
}
