import java.util.Scanner;

public class StringConcatenation {

    public static void main(String[] args) {
       
     Scanner scan=new Scanner(System.in);

    System.out.print("Enter first String: "); //to accept first string
    String str1=scan.next();

    System.out.print("Enter Second String: "); //to accept second string
    String str2=scan.next();

    scan.close();
 
    int size=str1.length()+str2.length(); //to find the length of concatenated string
    char str3[]=new char[size];
    int temp=0;

    
    //concatenating strings
        for(int i=0;i<str1.length();i++) 
        {
            str3[i]=str1.charAt(i);
            temp++;
        }
        for(int i=0;i<str2.length();i++)
        {
            str3[temp+i]=str2.charAt(i);
        }
        

        String str = String. valueOf(str3); //to convert char array into string

        System.out.println("string after concatenation is: "+str);
    }  

    public static void concatenate(String s,int temp)
    
}
