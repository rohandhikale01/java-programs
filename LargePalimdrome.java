import java.util.Scanner;

public class LargePalimdrome {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        int maxSize=0;

        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                String temp="";
                for(int k=i;k<=j;k++)
                {
                    temp+=str.charAt(k);
                }
                // System.out.println(temp);
                int newSize=temp.length();
              Boolean flag=isPalindrome(temp);
              if(flag&&maxSize<newSize)
              {
                maxSize=newSize;
              }
            }
           
        }

        System.out.println(maxSize);
    }

    public static boolean isPalindrome(String str)
    {
      StringBuilder sb=new StringBuilder(str);
      sb.reverse();
      
      if(str.equals(sb.toString()))
        {
            return true;
        }
        else
        {
           return false;
        }
       
    
    }
}
