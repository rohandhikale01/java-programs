import java.util.Scanner;

public class Car_Choise
{
    public static void main(String[] args) {
        
    Scanner scan=new Scanner(System.in);

    int size=scan.nextInt();
    int arr[][]=new int[size][4]; 

    for(int i=0;i<size;i++)
    {
        for(int j=0;j<4;j++)
        {
            arr[i][j]=scan.nextInt();
        }
    }

    for(int i=0;i<size;i++)
    {
        printCar(arr[i][0],arr[i][1],arr[i][2],arr[i][3]);
    }
    }

    public static void printCar(int avg1,int avg2,int diesel,int petrol)
    {
            float val1=(float)diesel/avg1;
            float val2=(float)petrol/avg2;

            if(val1<val2)
            {
                System.out.println("-1");
            }
            else if(val2<val1)
            {
                System.out.println("1");
            }
            else
            {
                System.out.println("0");
            }

    }
}