import java.util.Scanner;
public class MergeArray {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the size of your first Array & Second Array Respectively: ");
        int size1=in.nextInt();
        int size2=in.nextInt();

        int arr1[]=new int[size1];

        int arr2[]=new int[size2];

        int arr3[]=new int[size1+size2];

        System.out.println("Enter the Element of First Array: ");

        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=in.nextInt();
            arr3[i]=arr1[i];
        }

        System.out.println("Enter the Element of Second Array: ");

        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=in.nextInt();
            arr3[size1+i]=arr2[i];
        }

        in.close();

        System.out.println("Third Array After Merge: ");

        for(int i=0;i<arr3.length;i++)
        {
            System.out.println(arr3[i]);
        }

        int key=0,temp=0;
        for(int i=0;i<arr3.length;i++)
        {
            key=arr3[i];
            for(int j=0;j<arr3.length;j++)
            {
                if(key<arr3[j])
                {
                    temp=arr3[j];
                    arr3[j]=key;
                    arr3[i]=temp;
                    key=arr3[i];
                }
            }
        }

        System.out.println("Third Array After Sort: ");

        for(int i=0;i<arr3.length;i++)
        {
            System.out.println(arr3[i]);
        }





    }
    
}
