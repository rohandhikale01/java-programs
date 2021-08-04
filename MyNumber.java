public class MyNumber {

    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        MyClass obj = new MyClass(x);

        if (obj.isPositive())
            System.out.println("Number is Positive");

        if (obj.isNegative())
            System.out.println("Number is Negative");

        if (obj.isZero())
            System.out.println("Number is Zero");

        if (obj.isEven())
            System.out.println("Number is Even");

        if (obj.isodd())
            System.out.println("Number is Odd");

    }

}

class MyClass {
    int num;

    public MyClass()
    {
        num=0;   
    }

    public MyClass(int x)
    {
        num=x;   
    }

    public boolean isPositive() {
        if (num > 0) {
            return true;
        } else
            return false;
    }

    public boolean isNegative() {
        if (num < 0) {
            return true;
        } else
            return false;
    }

    public boolean isZero() {
        if (num == 0) {
            return true;
        } else
            return false;
    }

    public boolean isEven() {
        if (num % 2 == 0) {
            return true;
        } else
            return false;
    }

    public boolean isodd() {
        if (num % 2 != 0) {
            return true;
        } else
            return false;
    }

}
