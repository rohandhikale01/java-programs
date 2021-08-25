import java.util.Scanner;
public class SumOfDigonalElemets
{ 
	public static void main(String a[])
	{	
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Dimensions Of Your Matrix: ");
		int row=scan.nextInt();
		int col=scan.nextInt();
	
		if(row!=col)
		{ 	
			System.out.print("value of Row & Colum should be same ");
			return;
		}
		int mat[][]=new int[row][col];
		System.out.println("Enters Numbers: ");
	
		for(int i=0;i<mat.length;i++)
		{	
			System.out.print("Enters Numbers of  colum "+(i+1)+" :");
			for(int j=0;j<mat[i].length;j++)
			{	
				mat[i][j]=scan.nextInt();
			}
		}

		int sum=0;
		for(int i=0;i<mat.length;i++)
		{	
			for(int j=0;j<mat[i].length;j++)
			{	
				if(i==j)
				sum=sum+mat[i][j];
			}
		}
	System.out.print("Sum of Digonal Numbers is : "+sum);



}
}