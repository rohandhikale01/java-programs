import java.util.Scanner;

//code chef
public class EqualInt {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[][]=new int[size][2];

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<2;j++)
            {
            arr[i][j]=scan.nextInt();

            }
        }
        for (int[] is : arr) {
            getCount(is);
        }

    }

    public static void getCount(int arr[])
    {
        int num1=arr[0];
        int num2=arr[1];
        int count=0;

        while(num1!=num2)
        {
            if(num1<num2)
            {
                num1+=1;
                count++;
            }
            else  if(num1>num2)
            {
                num2+=2;
                count++;

            }

        }
        System.out.println(count);

    }
}
