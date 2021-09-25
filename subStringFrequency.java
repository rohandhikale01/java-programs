import java.util.Scanner;

public class subStringFrequency {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter the String: ");
        String str=scan.nextLine();

        System.out.print("Enter the sub string whose frequency is to be find: ");
        String subString=scan.nextLine();

        scan.close();

        int count=0;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==subString.charAt(0))
            {   
                int k=0,temp=0;
                for(int j=i;j<(i+(subString.length()));j++)
                {
                    if(str.charAt(j)==subString.charAt(k++))
                    temp++;
                }
                if(temp==subString.length())
                count++;

            }
            
        }

        System.out.println("Sub String count of "+subString+" is(Considering Case): "+count);
    }
    
}
