import java.util.Scanner;

public class countString {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int ans[][]=new int[size][2];

        for(int i=0;i<size;i++)
        {
            int key=scan.nextInt();
            String str[]=new String[key];
            for(int j=0;j<key;j++)
            {
                str[j]=scan.next();
            }
       }
           

        }

        // for (int[] is : ans) {
        //     System.out.println(is[0]+" "+is[1]);
        // }
    }


