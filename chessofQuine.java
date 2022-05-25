import java.util.Scanner;

public class chessofQuine {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[][]=new int[size][3];
        
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<3;j++)
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
        int myarr[]=new int[8];
        int N=arr[0];
        int X=arr[1];
        int Y=arr[2];

        myarr[0]=(N-X);
        myarr[1]=(X-1);
        myarr[2]=(Y-1);
        myarr[3]=(N-Y);

        myarr[4]=getTopLeftCount(X, Y,N);
        myarr[5]=getTopRightCount(X, Y,N);
        myarr[6]=bottomLeftCount(X,Y,N);
        myarr[7]=bottomRightCount(X, Y,N);

        int sum=0;
        for (int i : myarr) {
            sum+=i;
        }
        System.out.println(sum);

    }

    public static int bottomRightCount(int x,int y,int n)
    { int count=0;

        while(x!=n&&y!=n)
        {
            count++;
            x++;
            y++;
        }
        return count;
    } 
    public static int bottomLeftCount(int x,int y,int n)
    { int count=0;

        while(x!=1&&y!=n)
        {
            count++;
            x--;
            y++;
        }
        return count;
    } 
    public static int getTopLeftCount(int x,int y,int n)
    { int count=0;

        while(x!=1&&y!=1)
        {
            count++;
            x--;
            y--;
        }
        return count;
    }

    public static int getTopRightCount(int x,int y,int n)
    { int count=0;

        while(x!=n&&y!=1)
        {
            count++;
            x++;
            y--;
        }
        return count;
    }
}
