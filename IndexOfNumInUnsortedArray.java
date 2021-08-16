import java.util.Scanner;
public class IndexOfNumInUnsortedArray {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("How many Elements in your Array: ");
        int size=scan.nextInt();

        int arr[]=new int[size];
        System.out.print("Start Entering Numbers: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }

        System.out.print("Enter the number Whose Index Is to be find: ");
        int key=scan.nextInt();
        scan.close();

        int loc=0;
        boolean isNumberExist=false;

        for(int i=0;i<arr.length;i++)
        {
            if(key==arr[i])
            {
                loc=i;
                isNumberExist=true;

            }
        }

        if(isNumberExist)
        {
            System.out.println("Index of Your Key Number is: "+loc);
        }
        else
        {
            System.out.println("Your Key Number is not exist in Given List");

        }



    }
    
}
