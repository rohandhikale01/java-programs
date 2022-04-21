import java.util.*;
public class CarsandBikes {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }

        for (int i : arr) {
          isPossible(i);   
        }
    }

    public static void isPossible(int tyres)
    {
        if(tyres%4==0)
        {
            System.out.println("NO");
        }
        else if(tyres%4==2)
        {
            System.out.println("YES");
        }
    }
}
