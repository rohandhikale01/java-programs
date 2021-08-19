import java.util.Scanner;
public  class IndexOfLargestNumber{

    public static void main(String a[]) 
    {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the size of your array: ");
        int size=scan.nextInt(); //accepting the size from user

        int arr[]=new int[size]; //creating array 

        System.out.print("Enter numbers: ");

        //scanning numbers
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        scan.close();

        int max=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            if(max==arr[i])
            {
                System.out.println("The Maximum Number is "+max+" & it's Index is: "+i);
                break;
            }
        }

    }

}