import java.util.Scanner;
public class CountWhiteSpaces {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str=scan.nextLine();

        scan.close();

        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                count++;
            }
        }

        System.out.println("Total White Spaces in String is: "+ count);
    }
    
}
