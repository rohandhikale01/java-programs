import java.util.Scanner;

public class digitSumAndConcatenate
{
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str=scan.nextLine();

        char[] ch=new char[str.length()];

        int sum=0,j=0;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>=48&&str.charAt(i)<=57)
            {
                sum=sum+str.charAt(i)-48;
            }
            else
            {
                ch[j++]=str.charAt(i);
            }
        }

        String newstr=String.valueOf(ch);

        newstr=newstr+sum;

        System.out.println("Your Digit sum & concatenate string is: "+newstr);
    }
}