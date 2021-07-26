import java.util.Scanner;
public class Triangle_Game {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

        System.out.print("Enter The Angles of Triangle: ");
        int a1=in.nextInt();
        int a2=in.nextInt();
        int a3=in.nextInt();

        if((a1+a2+a3)==180)
        {
            if(a1==90||a2==90||a3==90)
            {
                System.out.println("Prize 2");
            }
            else if(a1==60&&a2==60&&a3==60)
            {
                System.out.println("Prize 3");
            }
            else
            {
                System.out.println("Prize 1"); 
            }
        }
        else
        {
            System.out.println("No Prize");

        }

    }
    
}
