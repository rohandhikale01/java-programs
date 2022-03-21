import java.util.Scanner;

public class PossibleVictory {
    public static void main(String[] args) {
        
        Scanner Scan=new Scanner(System.in);

        int R=0,O=0,C=0;

        R=Scan.nextInt();
        O=Scan.nextInt();
        C=Scan.nextInt();

        if(R<((20-O)*36+C))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("No");
        }
    }
}
