package MyPack;

public class MyMath
{
    public int add(int a, int b)
    {
        return a + b;
    }
}
import MyPack.MyMath;

class Test
{
    public static void main(String args[])
    {
        MyMath ob = new MyMath();

        int a = 10, b = 5;

        int c = ob.add(a, b);

        System.out.println("Addition = " + c);
    }
}