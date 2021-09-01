import java.util.Scanner;

public class ToCountAlphabets {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the string To find alphabets: "); //to accept the string 
        String str=scan.nextLine();

        scan.close();;

        int count=0,temp=0;
        for(int i=0;i<str.length();i++) //to count alphabets
        {
            temp=str.charAt(i);
            if((temp>=65&&temp<=90)||(temp>97&&temp<=122))
            count++;
        }

        System.out.println("Total Alphabets in your string :"+count);

        
    }
    
}
