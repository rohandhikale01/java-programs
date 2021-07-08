public class constructorDemo{

    public static void main(String a[]) {

        System.out.println("Hi");

        A IMCA=new A(1,2); //constructor calling //
        
    }
    
}

 class A
{
    int a;
    float f;

    public A()
    {
        System.out.println("Inside constructor with no parameters");
    }

    public A(int i)
    {   System.out.println("Inside constructor with one parameter");
    }

    public A(int i,int j)
    {   System.out.println("Inside constructor with two parameter");
    }
}

    
