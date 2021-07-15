
public class EncapsulationDemo{

    public static void main(String a[])
    {
        Emp e1=new Emp();
        Emp e2=new Emp();
        Emp e3=new Emp();

        e1.setId(101);
        System.out.println("ID of first Emp: " +e1.getId());

        e2.setId(201);
        System.out.println("ID of first Emp: " +e2.getId());

        e3.setId(301);

        System.out.println("ID of first Emp: " +e2.getId());


    }

}

class Emp 
{
    private int id;

    public void setId(int i)
    {
        id=i;
    }

    public int getId()
    {
        return id;
    }


}