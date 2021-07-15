public class InheritanceDemo {

    public static void main(String a[])
    {
        advadd obj=new advadd();

        obj.num1=5;
        obj.num2=3;

        System.out.println("Addition: "+obj.a());
        System.out.println("Subtraction: "+obj.sub());
    }
    
}
//single level inheritance //
class add //parent class//
{
    int num1,num2,result;

    public int a()
    {
        result =num1+num2;
        return result;
    }
}

class advadd extends add // child class //

{
    public int sub()
    {
        result=num1-num2;
        return result;
    }
   
}
