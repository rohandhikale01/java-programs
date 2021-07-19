public class pattern3 {

    public static void main(String a[])
    {
        int i,j;

        for(i=1;i<=5;i++)
        {
            for(j=1;j<=10;j++)
            {
                if(j<=5)
               {
                    System.out.print("  ");
               }
                else
                {
                    System.out.print("x ");
                }
                
            }
            System.out.println();
        }
    }
    
}
