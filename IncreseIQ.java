import java.util.Scanner;

public class IncreseIQ {
  public static void main(String[] args) {
      
    Scanner scan=new Scanner(System.in);
    int iq=scan.nextInt();
    if((iq+7)>170)
    {
        System.out.println("YES");
    }
    else
    {
        System.out.println("No");
    }
  }  
}
