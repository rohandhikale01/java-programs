public class Count_Object {

 public static void main(String[] args) {

    A ob1=new A();
    A ob2=new A();
    A ob3=new A();

    System.out.println("Number of object is: "+A.i);
    
    }
    
}

class A
{
    static int i;//static variable is coomon to all object//

    public A() //Every time when object is called implicit call is given to constructor which increse the count of object in program of class A//
    {

        i++;
    }
}
