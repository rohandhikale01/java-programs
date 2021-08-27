
import java.util.Scanner;
public class MatrixTranspose {
    
  
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.print("Enter the Dimensions: "); //to get the dimensions 
        int dim=in.nextInt();

        int mat[][]=new int[dim][dim];

        for(int i=0;i<dim;i++) //to accept the elements
        {
            System.out.print("Enter Row Number "+(i+1)+" :");
            for(int j=0;j<dim;j++)
            {
                mat[i][j]=in.nextInt();
            }
        }
        in.close();

        for(int i=0;i<dim;i++) //to perform transpose operation
        {
            for(int j=i;j<dim;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        System.out.println("Your Transpose Matrix is:");  

        for(int i[]:mat)  //to print transpose matrix
        {
            System.out.println();
            for(int j:i)
            {
                System.out.print(j+" ");  
            }
        }      
        
    }

}
