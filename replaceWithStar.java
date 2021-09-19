
import java.util.Scanner;

public class replaceWithStar {
    
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str=scan.nextLine();

        System.out.print("Which character you want to replace with '*': " );
        char ch=scan.next().charAt(0);

        scan.close();

        char chArray[]=new char[str.length()];

        for(int i=0;i<str.length();i++)
        {
            if(ch==str.charAt(i))
            chArray[i]='*';
            else
            chArray[i]=str.charAt(i); 
        }


        String newstr=String.valueOf(chArray);

        System.out.println("String after Replacement: "+newstr);


    }
}
