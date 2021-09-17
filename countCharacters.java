import java.util.Scanner;

public class countCharacters {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter String: ");
        String str=scan.nextLine();

        str=str.toLowerCase();
        scan.close();

        int vowelCount=0,consonantCount=0,numberCount=0,specialCharactersCount=0;
        char ch=' ';

        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch>=97&&ch<=122)
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                vowelCount++;
                else
                consonantCount++;
            }
            else if(ch>=48&&ch<=57)
            numberCount++;
            else
            specialCharactersCount++;
        }

        System.out.println(" Total Vowels in string: "+vowelCount);
        System.out.println(" Total Consonant in string: "+consonantCount);
        System.out.println(" Total Numbers in string: "+numberCount);
        System.out.println(" Total Special Symbol in string: "+specialCharactersCount);



    }
    
}
