import java.util.*;
public class ThiefandPolice {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();

        int arr[][]=new  int[size][2];

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }

        for (int[] is : arr) {
            getMin(is);
        }
    }

    public static void getMin(int arr[])
    {
        int cX=arr[0];
        int cY=arr[1];
        int count=0;
        while(cX!=cY)
        {
            
            if(cX<cY)
            { cX+=2;
                cY+=1;
                count++;
            }
            if(cX>cY)
            {
                cX-=2;
                cY-=1;
                count++;
            }
            

        }
        System.out.println(count);

    }
}
