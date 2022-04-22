import java.util.Scanner;

public class PseudoArray {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        String ans[]=new String[size];

        for(int i=0;i<size;i++)
        {
            int key=scan.nextInt();
            int arr[]=new int[key];
            for(int j=0;j<key;j++)
            {
                arr[j]=scan.nextInt();
            }
            ans[i]=isPseudo(arr);
        }

        for (String string : ans) {
            System.out.println(string);
        }
    }
    public static String isPseudo(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                break;
            }
        }
        if(isNonDecreasing(arr))
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
    }

    public static boolean isNonDecreasing(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            return false;
        }
        return true;
    }
}
