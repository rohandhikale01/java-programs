import java.util.Scanner;

public class palindromeString {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str=scan.next();

        scan.close();

        char ch[]=new char[str.length()];

        for(int i=(str.length()-1),j=0;i>=0;i--,j++) //to create reverse string 
        {
            ch[j]=str.charAt(i);
        }

        int temp=0;

        for(int i=0;i<str.length();i++) //to check whether string is palindrome or not 
        {
            if(ch[i]==str.charAt(i))
            {
                temp++;
            }
            else 
            {
                break;
            }
        }

        if(temp==str.length())
        System.out.println("Given String is Palindrome");
        else
        System.out.println("Given String is  not Palindrome");

    }
    
}
