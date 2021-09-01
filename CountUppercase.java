import java.util.Scanner;
public class CountUppercase {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter The String whose Capital letters you want to count: "); //to accept the string 
        String str=scan.nextLine();

        scan.close();

        int count=0;
        int temp=0;
        for(int i=0;i<str.length();i++) //to count capital letters 
        {
           temp=str.charAt(i);
            if(temp>=65&&temp<=90)
            {
                count++;
            }

        }

        System.out.println("Total Uppercase letters in your String is: "+count);
    }
    
}
