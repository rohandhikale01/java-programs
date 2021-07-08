public class thisDemo {

     public static void main(String[] args)
      {
        MyClass obj=new MyClass(3,4);

        System.out.println(obj.a);
        System.out.println(obj.b);
    }
    
}
class MyClass
{
    int a;
    int b;

    public MyClass(int a,int b)
    {
       this.a=a; //this keyword uses when instance variable & formal variable have same name.(this is current instanc)//
       this.b=b;
    }
}