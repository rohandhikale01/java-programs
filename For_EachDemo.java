public class For_EachDemo {

    public static void main(String a[])
    {
        int ab[]={1,2,3,4,5}; 

        for(int i: ab)
        {
            System.out.println("number: " +i);
        }

        int arr[][]=new int[2][2];

        arr[0][0]=4;
        arr[0][1]=44;
        arr[1][0]=42;
        arr[1][1]=46;

        for(int i[]:arr)
        {
            for(int j:i)
            {
                System.out.println(j);
            }
        }
    }
    
}
