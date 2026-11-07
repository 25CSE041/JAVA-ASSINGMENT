interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Circle draw");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Rectangle draw");
    }
}

class Test {
    public static void main(String args[]) {

        Circle ob = new Circle();
        ob.draw();

        Rectangle ob1 = new Rectangle();
        ob1.draw();
    }
}