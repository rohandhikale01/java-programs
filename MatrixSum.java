import java.util.Scanner;
public class MatrixSum {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the Dimensions: ");
        int dim=scan.nextInt();

        int mat[][]=new int[dim][dim];

        int sum=0;

        for(int i=0;i<dim;i++)
        {
            System.out.print("Enter the Elements of"+(i+1)+" row :");
            for(int j=0;j<dim;j++)
            {
                mat[i][j]=scan.nextInt();
                sum=sum+mat[i][j];
            }
        }

        System.out.print("Sum of Matrix Elements: "+sum);


    }
    
}
