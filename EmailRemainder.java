import java.util.Scanner;

public class EmailRemainder {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int total=scan.nextInt();
        int size=scan.nextInt();
        System.out.println(total-size);
    }
}
