import java.util.Scanner;

public class ConsonantCount
{
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str=scan.nextLine();


        scan.close();
        int count=0;
        char ch=' ';
        for(int  i=0;i<str.length();i++)
        {
            ch=str.charAt(i);

            if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
            continue;
            else
            count++;
        }

        System.out.println("Total Consonant Count: "+count);
    }
}