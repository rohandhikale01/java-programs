public class PatternTwo {
            public static void main(String[] args) {
            
            int row=5;
            int col=5;
            int count=0;
            int temp=5;
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    if(j<count)
                    {
                        System.out.print(" ");
                    }
                    else
                    System.out.print(temp--);
                }
                System.out.println();
                temp=5;
                count++;
            }
        }
    
    
}
