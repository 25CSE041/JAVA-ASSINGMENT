class Animal {

    void eat() {
        System.out.println("Animal eats");
    }

    void sleep() {
        System.out.println("Animal sleeps");
    }
}

class Bird extends Animal {

    @Override
    void eat() {
        System.out.println("Bird eats");
    }

    @Override
    void sleep() {
        System.out.println("Bird sleeps");
    }

    void fly() {
        System.out.println("Bird flies");
    }
}

public class Main {
    public static void main(String[] args) {

        Bird b = new Bird();

        b.eat();
        b.sleep();
        b.fly();
    }
}