import java.util.Scanner;
public class sortString {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=scan.nextLine();

        scan.close();

        str=str.toUpperCase();

        char key=' ';
        char[] charArray=str.toCharArray();
      

       for(int i=0;i<str.length();i++)
       {
           key=charArray[i];
           for(int j=0;j<str.length();j++)
           {
               if(key<charArray[j]){
                   charArray[i]=charArray[j];
                   charArray[j]=key;
                   key=charArray[i];

               }
           }
       }

       String newstr=String.valueOf(charArray);

       System.out.println("String After  sorting: ");
       System.out.println(newstr);
 
    }

  
    
}

