import java.util.Scanner;

public class taller {
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
        gettTaller(is);
    }
  } 
  
  public static void gettTaller(int  arr[])
  {
      if(arr[0]<arr[1])
      {
        System.out.println("B");
      }
      else
      {
        System.out.println("A");

      }
  }
}
