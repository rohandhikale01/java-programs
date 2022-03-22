import java.util.Scanner;

public class WhichFuleIsCheeper {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();

        int arr[][] = new int[size][5];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        for(int i=0;i<size;i++)
        {
            getLessPrice(arr[i][0],arr[i][1],arr[i][2],arr[i][3],arr[i][4]);
        }
    }

    public static void getLessPrice(int P,int D,int Pa,int Da,int M)
    {
        int currentPetrol=P+Pa*M;
        int CurrentDisel=D+Da*M;
      

        if(currentPetrol>CurrentDisel)
        {
            System.out.println("DIESEL");
        }
        else if(currentPetrol<CurrentDisel)
        {
            System.out.println("PRTROl");
        }
        else if(currentPetrol==CurrentDisel)
        {
            System.out.println("SAME PRICE");
        }
    }

}
