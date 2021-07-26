import java.util.Scanner;
public class leapYear {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the year: ");
        int yr=in.nextInt();

        if(yr%4==0)
        {
            System.out.println("The given Year is leap.");
        }
        else
        {
            System.out.println("The given Year is not leap.");
        }
    }
    
}
