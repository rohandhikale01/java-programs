import java.util.Scanner;

public class subStringWithUsersLength {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str=scan.nextLine();

        System.out.print("Enter the length of your sub string: ");
        int size=scan.nextInt();

        scan.close();
        
        for(int i=0;i<(str.length()-(size-1));i++)
        {
            for(int j=i;j<(i+size);j++)
            {
                System.out.print(str.charAt(j));
            }
            System.out.println();

        }
        
    }
}
