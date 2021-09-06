import java.util.Scanner;

public class RemoveAlphanumeric {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=scan.nextLine();

        scan.close();

        char ch[]=new char[str.length()];
        int temp=0;

        for(int i=0,j=0;i<str.length();i++)
        {
            temp=str.charAt(i);
            if((temp>=65&&temp<=90)||(temp>=97&&temp<=122)||(temp>=48&&temp<=57))
            continue;
            else
            {
                ch[j++]=str.charAt(i);
            }
        }
        String newStr=String.valueOf(ch);

        System.out.println("String After removing Alphanumeric characters: "+newStr);
    }
    
}
