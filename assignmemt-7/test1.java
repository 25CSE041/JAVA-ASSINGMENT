package pack;

public class Test {
    public int cal(int x, int y) {
        return x * y;
    }
}
import pack.*;

class abc {
    public static void main(String args[]) {

        Test ob = new Test();

        int a = 10, b = 5, c;

        c = ob.cal(a, b);

        System.out.println("Multiplication = " + c);
    }
}