import java.util.Scanner;

public class removeDuplicate {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str=scan.nextLine();

        scan.close();
        
        int count[]=new int[256];

        char ch[]=new char[str.length()];

        int j=0;

        for(int i=0;i<str.length();i++)
        {
            if(count[str.charAt(i)]==0)
            {
                ch[j++]=str.charAt(i);
                count[str.charAt(i)]++;
            }
        }

        String newstr=String.valueOf(ch);

        System.out.println("Removing Duplicated character (Considering case): "+newstr);

    }
    
}
