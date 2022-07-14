import java.util.Scanner;

public class Palimdrome {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        String str=scan.next();

        StringBuilder sb=new StringBuilder(str);
        sb.reverse();

        if(str.equals(sb.toString()))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        
    }
}
 