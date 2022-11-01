public class pat1 {
    public static void main(String[] args) {
        
        boolean flag=true;
        int count=0;
        for(int i=0;i<9;i++)
        {
            int temp=4;
            for(int j=0;j<5;j++)
            {
                    if(j<=count)
                    System.out.print(" "+temp+" ");
                    else
                    System.out.print("   ");

                    temp--;
            }
            System.out.println();
            if(count==4)
            flag=false;

            if(flag)
            count++;
            else
            count--;
        }
    }
}
