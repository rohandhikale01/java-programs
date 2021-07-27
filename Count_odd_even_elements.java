import java.util.Scanner;
public class Count_odd_even_elements {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

        System.out.print("How many numbers do you want to enter: ");
        int size=in.nextInt(); //to know the size of an array //

        int arr[]=new int[size];

        int count_odd=0,count_even=0; //setting count zero//

        System.out.print("Start Entering the numbers: ");

        for(int i=0;i<size;i++)
        {
            arr[i]=in.nextInt();
            if(arr[i]%2==0) //checking whether number is even or odd//
            {
                count_even++;
            }
            else
            {
                count_odd++;
            }
        } //end of for loop//
        in.close();  //closing scanner//

        System.out.println("Number of even elements:"+count_even);
        System.out.println("Number of odd elements:"+count_odd);

    } //end of main method//
    
} //end of public class//
