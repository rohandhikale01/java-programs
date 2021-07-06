public class First_program_on_classs {

    public static void main(String args[])

    {
        Box MyBox=new Box(); //creating object of class Box//

        //MyBox is called as reference variable//
        MyBox.SetDimension(20,25,30); //Calling method //

        MyBox.ShowDimension();

    }
    
}

class Box
{
     private int len,brt,hght; //this are instance variable//
     //Methods are known as behavior //

     public void SetDimension(int l,int b,int h) //to pass & set dimensions //
     {
         len=l;
         brt=b;
         hght=h;
     }

     public void ShowDimension()  //to display the dimensions //
     {
         System.out.println("Length= "+len);
         System.out.println("Breth= "+brt);
         System.out.println("Height= "+hght);
     }



}
