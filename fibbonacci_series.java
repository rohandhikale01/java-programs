import java.util.Scanner;
public class fibbonacci_series {
    
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("How many terms do you want to find: ");
        int num=scan.nextInt();
        int temp1=0;
        int temp2=1;
        int term=0;

        System.out.print(temp1+" "+temp2+" ");

        for(int i=1;i<=(num-2);i++)
        {
            term=temp1+temp2;
            temp1=temp2;
            temp2=term;
            System.out.print(term+" ");
        }


    }
}
