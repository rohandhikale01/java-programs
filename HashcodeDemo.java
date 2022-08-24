public class HashcodeDemo {
    int i;
    HashcodeDemo(int i)
    {
        this.i=i;
    }

    public int hashCode()
    {
        return i;
    }
    public static void main(String[] args) {
    
        HashcodeDemo obj1=new HashcodeDemo(10);
        System.out.println(obj1);

        HashcodeDemo obj2=new HashcodeDemo(100);
        System.out.println(obj2);

    }
}
