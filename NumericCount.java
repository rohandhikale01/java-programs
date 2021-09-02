import java.util.Scanner;

public class NumericCount {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter String: "); //to accept the string 
        String str=scan.nextLine();

        scan.close();
        int count=0,temp=0;     

        for(int i=0;i<str.length();i++)  //to count numbers
        {
            temp=str.charAt(i);
            if((temp>=48&&temp<=57))
            count++;
        }

        System.out.println("Total Numeric constant in a string: "+count);
    }
    
}
