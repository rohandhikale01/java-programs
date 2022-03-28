import java.util.Scanner;
//This code is from Hacker Earth
public class Zoos {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        int z=0,o=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='z')
            z++;
            else if(ch=='o')
            o++;
        }

        if(2*z==o)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
