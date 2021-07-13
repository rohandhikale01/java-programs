import java.util.Scanner;
public class Scan_and_print_Array {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int arr[]=new int[3];

        for(int i=0;i<3;i++)
        {
            System.out.print("Enter numbber- ");
            arr[i]=in.nextInt();
            System.out.println();
        }

        for(int i:arr)
        {
            System.out.println("Nummer: " +i);
        }
        
    }


    
}
