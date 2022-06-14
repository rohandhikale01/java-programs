import java.util.Scanner;

public class Apple {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int total=scan.nextInt();
        int p1=scan.nextInt();
        int p2=scan.nextInt();

        if(total>=p1+p2)
        System.out.println("YES");
        else
        System.out.println("NO");

    }
}
