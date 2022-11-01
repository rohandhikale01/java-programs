public class pat3 {
    public static void main(String[] args) {
        
        for(int i=0;i<5;i++)
        {
            int temp=65;
            for(int j=5;j>=0;j--)
            {
                if(i>=j)
                {
                System.out.print((char)(temp)+" ");
                temp++;
                    
                }
                else
                System.out.print(" ");


            }
            System.out.println();
        }
    }
}
