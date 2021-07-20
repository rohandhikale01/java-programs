public class Inverted_traingle_pattern {

public static void main(String[] args) {

    int i,j,k;

    for(i=1;i<=5;i++)
    {
        for(k=1;k<=i;k++)
        {
            System.out.print("  ");
        }
        for(j=1;j<=(11-(2*i));j++)
        {
            System.out.print("* ");
        }

        System.out.println();
    }
        
    } 
    
}
