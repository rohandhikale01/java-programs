import java.util.Scanner;
public class SquareOfArrayElements {

    

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        
        System.out.print("Enter the Size of Array: ");
        int size=in.nextInt();

        int arr[]=new int[size]; 

        System.out.print("Enter the Array Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }

        int sqr[]=new int[size];

        for(int i=0;i<arr.length;i++)
        {
            sqr[i]=Square(arr[i]);
        }

      
        for(int i=0;i<sqr.length;i++)
        {
            System.out.println("Square of "+arr[i]+" is: "+sqr[i]);
        }





    }

    public static int Square(int num)
    {
        return num*num;
    }

    
}
