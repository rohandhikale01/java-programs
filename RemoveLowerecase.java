import java.util.Scanner;

public class RemoveLowerecase 
{
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str=scan.nextLine();

        scan.close();

        char ch[]=new char[str.length()];
        int temp=0;

        for(int i=0,j=0;i<str.length();i++)
        { temp=str.charAt(i);
            if((temp>=97)&&(temp<122))
            continue;
            else
            {
                ch[j++]=str.charAt(i);
            }
        }

        String newStr=String.valueOf(ch);

        System.out.println("String After removing LowerCase Characters: "+newStr);
    }
    
}
