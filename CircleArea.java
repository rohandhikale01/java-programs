import java.util.Scanner;

public class CircleArea {

     public static void main(String[] args) {

        float p=3.1421f;
        float A,r;
        Scanner s=new Scanner(System.in);
        System.out.println("Entre the Radius- ");
        r=s.nextFloat();

        A=2*p*r*r;

        System.out.println("Area Of Circle: " +A);

        
    }
    
}
