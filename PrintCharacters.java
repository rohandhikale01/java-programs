import java.util.Scanner;
public class PrintCharacters {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter The String: ");
        String  str=scan.next();

        scan.close();

        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }
    }
    
}

