public class HascCodeDemo2 {
    int i;
    HascCodeDemo2(int i)
    {
        this.i=i;
    }
    public String toString()
    {
        return "Code"+i;
    }

    public static void main(String[] args) {
        
        HascCodeDemo2 obj1=new HascCodeDemo2(100);
        System.out.println(obj1);
    }
}
