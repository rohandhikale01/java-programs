import java.util.Scanner;

public class toUpper {

    public static void main(String[] args) {
        
        Scanner scan=new  Scanner(System.in);

       System.out.print("Enter String:  ");
       String str=scan.nextLine();
    
       scan.close();

       char ch[]=new char[str.length()];
       int temp=0;

       for(int i=0;i<str.length();i++)
       {
           temp=str.charAt(i);

           if(temp>=97&&temp<=122)
           {
            ch[i]=(char)(temp-32);
           }
           else
           ch[i]=str.charAt(i);    
       }

       String newstr=String.valueOf(ch);

       System.out.println("Your String in upper case is: "+newstr);
        
            
    }
    
}
