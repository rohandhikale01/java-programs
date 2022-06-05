import java.util.Scanner;

//code chef
public class Playlist {
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
            getMusicCount(is);
        }
    }

    public static void getMusicCount(int arr[])
    {
        System.out.println(arr[0]/(arr[1]*3));
    }
}
