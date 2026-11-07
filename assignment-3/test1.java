class Box
{
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth)
    {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double getVolume()
    {
        return width * height * depth;
    }
}

public class Test8
{
    public static void main(String args[])
    {
        Box b1 = new Box(5.0, 3.0, 2.0);

        System.out.println("width: " + b1.width);
        System.out.println("height: " + b1.height);
        System.out.println("depth: " + b1.depth);

        System.out.println("Volume: " + b1.getVolume());
    }
}