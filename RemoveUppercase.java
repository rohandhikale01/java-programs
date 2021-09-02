import java.util.Scanner;

public class RemoveUppercase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the String: "); //to accept the string 
        String str = scan.nextLine();

        scan.close();
        int size = str.length();

        char ch[] = new char[size];
        int temp = 0;

        for (int i = 0, j = 0; i < str.length(); i++) {  //to remove Uppercase Characters 
            temp = str.charAt(i); 
            if ((temp >= 65 && temp <= 90)) {
                continue;
            } else {
                ch[j++] = str.charAt(i);

            }

        }

        String newStr = String.valueOf(ch);

        System.out.println("New String after Removing Uppercase Characters: " + newStr);

    }

}
