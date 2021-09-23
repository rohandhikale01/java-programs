import java.util.Scanner;

public class characterFrequency {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str=scan.nextLine();

        scan.close();

        str=str.toUpperCase();
        int count[]=new int[26];

        for(int i=0;i<str.length();i++) //to count the character frequency
        {
            if(str.charAt(i)>=65&&str.charAt(i)<90)
            {
                count[(str.charAt(i)-65)]++;
            }
            else
            {
                continue;
            }
        }

        System.out.println("Character frequency Ignoring Case is: ");
        for(int i=0;i<26;i++) //to display the frequency 
        {
            if(count[i]>0)
            {
                char ch=(char)(i+65);
                System.out.println(ch+" - "+count[i]);
            }
        }

        
    }
    
}
