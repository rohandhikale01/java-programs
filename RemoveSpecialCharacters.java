import java.util.Scanner;

public class RemoveSpecialCharacters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the string : "); // to accept the string
        String str = scan.nextLine();

        scan.close();

        int size = str.length();

        char ch[] = new char[size];
        int temp = 0;

        for (int i = 0, j = 0; i < str.length(); i++) // to remove special characters 
        {
            temp = str.charAt(i);
            if ((temp >= 48 && temp <= 57) || (temp >= 65 && temp <= 90) || (temp >= 97 && temp <= 122))
                ch[j++] = str.charAt(i);
        }

        String newStr = String.valueOf(ch); //to convert char array into string 

        System.out.println("New String after Removing  Special Characters is : " + newStr);

    }

}
