public class pat3 {
    public static void main(String[] args) {
        int count=3;
        for(int i=0;i<5;i++)
        {  
            for(int k=0;k<2;k++)
            {
                for(int j=4;j>=0;j--)
                {
                if(i>=j)
                {
                System.out.print("* ");
                    
                }
                else
                System.out.print(" ");
                }

                if(k==0)
                {
                    for(int l=0;l<count;l++)
                    {
                    System.out.print(" ");

                    }
                }
            }
            System.out.println();
            count--;        
            }
        }
           
        }
    

 

