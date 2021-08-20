import java.util.Scanner;

public class ReverseArray {
	public static void main(String a[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers do you want to enter:  ");
		int size = scan.nextInt();

		int arr[] = new int[size];

		System.out.print("Enter your Numbers:  ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		reverseArray(arr, size);

	}

	public static void reverseArray(int arr[], int size) 
	{
		int revarr[] = new int[size];

		for (int i = 0, j = (size - 1); i < arr.length; i++) 
		{
			revarr[j] = arr[i];
			j--;
		}

		System.out.print("Numbers in reverse order: ");

		for (int i : revarr) 
		{
			System.out.print(i + " ");
		}

	}

}
