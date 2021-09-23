import java.util.Scanner;

public class anagramString {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter your First String: ");
        String str1=scan.nextLine();

        System.out.print("Enter your Second String: ");
        String str2=scan.nextLine();
    
        scan.close();

        
        str1=str1.toUpperCase();
        int count1[]=new int[26];

        for(int i=0;i<str1.length();i++) //to count the character frequency
        {
            if(str1.charAt(i)>=65&&str1.charAt(i)<90)
            {
                count1[(str1.charAt(i)-65)]++;
            }
            else
            {
                continue;
            }
        }

           
        str2=str2.toUpperCase();
        int count2[]=new int[26];

        for(int i=0;i<str2.length();i++) //to count the character frequency
        {
            if(str2.charAt(i)>=65&&str2.charAt(i)<90)
            {
                count2[(str2.charAt(i)-65)]++;
            }
            else
            {
                continue;
            }
        }

        int temp=0;
        for(int i=0;i<26;i++)
        {
            if(count1[i]==count2[i])
            temp++;
            else
            continue;
        }

        if(temp==26)
        System.out.println("Strings are Anagram");
        else
        System.out.println("Strings are not Anagram");


    }
    
}
