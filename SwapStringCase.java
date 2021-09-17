import java.util.Scanner;

public class SwapStringCase {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter the String: ");
        String str=scan.nextLine();

        scan.close();
        char ch[]=new char[str.length()];

        int temp=0;
        for(int i=0;i<str.length();i++)
        {
            temp=str.charAt(i);
            if(temp>=97&&temp<=122)
            ch[i]=(char)(temp-32);
            else if(temp>=65&&temp<=90)
            ch[i]=(char)(temp+32);
            else
            ch[i]=str.charAt(i);

        }

        String newstr=String.valueOf(ch);

        System.out.println("Your String With Swapping of cases: "+newstr);

    }
    
}
