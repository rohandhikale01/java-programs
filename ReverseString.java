import java.util.Scanner;
public class ReverseString {
    
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter Your String: "); //to accept the string 
        String str=scan.next();

        scan.close();

        char ch[]=new char[str.length()]; //to create char array which has same size as string str
     
        for(int i=(str.length()-1),j=0;i>=0;i--,j++) //to reverse string 
        {
            ch[j]=str.charAt(i);
        }

        String revString=String.valueOf(ch); //to convert char array into string 

        System.out.println("Reverse String is: "+revString);
    }
}
