import java.util.Scanner;

public class CountLowerCase {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter The String whose LowerCase letters you want to count: "); //to accept the string 
        String str=scan.nextLine();

        scan.close();

        int count=0;
        int temp=0;
        for(int i=0;i<str.length();i++) //to count Lowercase  letters 
        {
           temp=str.charAt(i);
            if(temp>=97&&temp<=122)
            {
                count++;
            }

        }

        System.out.println("Total Lowercase letters in your String is: "+count);
    }
    
}
