import java.util.Scanner;
public class palindromNumber {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        int rev_num=0,temp,my_num;

        my_num=num;
        while(true)
        {
            temp=num%10;
            rev_num=rev_num+temp;
            num=num/10;
            if(num<=0)
            {
                break;
            }
            rev_num*=10;    
        }
        
        if(my_num==rev_num)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
        
    }
    
}
