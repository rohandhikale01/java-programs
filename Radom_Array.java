import java.util.Random;
public class Radom_Array {

    public static void main(String a[])
    {
        Random r=new Random(); //creating random object reference variable//

        int arr[]=new int[10];  //creating array of length 10 //

        int i;

        for(i=0;i<arr.length;i++)
        {
            arr[i]=r.nextInt(50);//storing random numbers upto 50 in a array//
        }

        for(int j:arr)
        {
            System.out.println(j);
        }
    }
    
}
