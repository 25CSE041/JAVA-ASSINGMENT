class Fruit {
    String name;
    String taste;
    int size;

    Fruit(String name, String taste, int size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

class Apple extends Fruit {

    Apple() {
        super("Apple", "Sweet", 5);
    }

    @Override
    void eat() {
        System.out.println("Apple tastes sweet");
    }
}

class Orange extends Fruit {

    Orange() {
        super("Orange", "Sour", 3);
    }

    @Override
    void eat() {
        System.out.println("Orange tastes sour");
    }
}

public class Main {
    public static void main(String args[]) {

        Apple a = new Apple();
        Orange o = new Orange();

        a.eat();
        o.eat();
    }
}