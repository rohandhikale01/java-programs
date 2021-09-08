import java.util.Scanner;

public class RemoveVowel {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str=scan.nextLine();
        scan.close();

        char ch[]=new char[str.length()];
        char temp=' ';
        for(int i=0,j=0;i<str.length();i++)
        {
            temp=str.charAt(i);
            if(temp=='A'||temp=='a'||temp=='E'||temp=='e'||temp=='I'||temp=='i'||temp=='O'||temp=='o'||temp=='U'||temp=='u')
            {
            continue;

            }
            else
            {
            ch[j++]=temp;

            }
        }

        String newStr=String.valueOf(ch);

        System.out.println("New String after removing Vowels: "+newStr);

    }
    
}
