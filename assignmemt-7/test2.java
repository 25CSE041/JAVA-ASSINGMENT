package pack;

public class A
{
    public int x = 10;
    protected int y = 20;
    int z = 30;
    private int w = 40;

    public void display()
    {
        System.out.println("Public: " + x);
        System.out.println("Protected: " + y);
        System.out.println("Default: " + z);
        System.out.println("Private: " + w);
    }
}
package pack;

class B
{
    public static void main(String args[])
    {
        A obj = new A();

        System.out.println("Public: " + obj.x);
        System.out.println("Protected: " + obj.y);
        System.out.println("Default: " + obj.z);

        obj.display();
    }
}