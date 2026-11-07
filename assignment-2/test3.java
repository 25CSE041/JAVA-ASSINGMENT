import java.util.Arrays;

class test {
    public static void main(String args[])
    {
        int a[] = {10, 25, 5, 40, 15};

        Arrays.sort(a);

        System.out.println("smallest two numbers");
        System.out.println(a[0]);
        System.out.println(a[1]);

        System.out.println("largest two numbers");
        System.out.println(a[a.length-1]);
        System.out.println(a[a.length-2]);
    }
}