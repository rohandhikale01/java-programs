import java.util.Scanner;

public class panagaramString {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str=scan.nextLine();

        scan.close();

        str=str.toUpperCase();
        int count[]=new int[26];

        for(int i=0;i<str.length();i++) //to count the character frequency
        {
            if(str.charAt(i)>=65&&str.charAt(i)<90)
            {
                count[(str.charAt(i)-65)]++;
            }
            else
            {
                continue;
            }
        }

        int temp=0;
        for(int i=0;i<26;i++)
        {
            if(count[i]>0)
            temp++;
            else
            break;

        }

        if(temp==25)
        System.out.println("String is Pangram");
        else
        System.out.println("String is not Pangram");

    }
    
}
