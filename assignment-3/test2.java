import java.util.*;
public class Cars
{
    static int pownt(int m, int x)
    {
        return Math.pow(x, m);
    }

    public static double powable(double x, double y)
    {
        return Math.pow(x, y);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter m,n");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Power of x^y: " + pownt(x, y));
        System.out.println("Power of x^y: " + powable(x, y));
    }
}