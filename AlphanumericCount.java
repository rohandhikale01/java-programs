import java.util.Scanner;

public class AlphanumericCount {
    
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the string To count  Alphanumeric: "); //to accept the string 
        String str=scan.nextLine();

        scan.close();;

        int count=0,temp=0;
        for(int i=0;i<str.length();i++) //to count Alphanumeric
        {
            temp=str.charAt(i);
            if((temp>=65&&temp<=90)||(temp>97&&temp<=122)||(temp>=47&&temp<=56))
            count++;
        }

        System.out.println("Total Alphanumeric in your string :"+count);

        
    }
    
}
