import java.util.Scanner;
public class IndexOfSmallestNumber
{
	public static void main(String a[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("How many Elements you want to Enter: ");
		int size=scan.nextInt();
		
		int arr[]=new int[size];
		System.out.print("Start Entering The Numbers: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(min==arr[i])
			{
				System.out.println("The Minimum Number in given array is "+min+" & it's Index value is "+i);
			}
		}		
	}
}
