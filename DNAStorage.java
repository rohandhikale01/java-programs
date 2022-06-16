import java.util.Scanner;

public class DNAStorage {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        String str[]=new String[size];

        for(int i=0;i<size;i++)
        {
            int temp=scan.nextInt();
            str[i]=scan.next();
        }
        for (String string : str) {
            DecodeString(string);
        }
    }

    public static void DecodeString(String str)
    {
        for(int i=0;i<(str.length());i+=2)
        {
            if((str.charAt(i)=='0')&&(str.charAt(i+1)=='0'))
            System.out.print("A");
            else if((str.charAt(i)=='0')&&(str.charAt(i+1)=='1'))
            System.out.print("T");
            else if((str.charAt(i)=='1')&&(str.charAt(i+1)=='0'))
            System.out.print("C");
            else if((str.charAt(i)=='1')&&(str.charAt(i+1)=='1'))
            System.out.print("G");

        }
        System.out.println();
    }
}
