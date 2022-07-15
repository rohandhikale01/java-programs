import java.util.Scanner;

public class LongestSeqOfEvenNumber {
   public static void main(String[] args) {
    
    Scanner scan=new Scanner(System.in);

    int size=scan.nextInt();

    int arr[]=new int[size];

    for(int i=0;i<size;i++)
    {
        arr[i]=scan.nextInt();
    }
    int maxSize=0,tempMaxSize=0;

    for(int i=0;i<size;i++)
    {
        if(arr[i]%2==0)
        {
            tempMaxSize++;
        }
        else
        {
            if(maxSize<tempMaxSize)
            {
                maxSize=tempMaxSize;
            }
                tempMaxSize=0;
        }
        
    }

    System.out.println(maxSize);
    
   } 
}
