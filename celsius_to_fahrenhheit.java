import java.util.Scanner;
public class celsius_to_fahrenhheit {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

        System.out.print("Enter temp in Celsius: ");
        float cel=in.nextFloat();

        float fhr=(cel*9/5)+32;

        System.out.print("Temp in Fahrenheit: "+fhr);



    }
    
}
