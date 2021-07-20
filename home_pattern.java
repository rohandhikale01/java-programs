public class home_pattern {

    public static void main(String[] args) {
        
        int i,j,k;

        for(i=1;i<=5;i++)
        {
            for(k=1;k<=(6-i);k++)
            {
                System.out.print("  ");
            }
            for(j=1;j<=(2*i-1);j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=1;i<=5;i++)
        {
            System.out.print("  ");
            for(j=1;j<=9;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
