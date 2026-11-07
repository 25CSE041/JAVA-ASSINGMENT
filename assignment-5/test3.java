interface Greeting {
    abstract public void sayHello();

    default public void sayBye() {
        System.out.println("Say Bye");
    }
}

class MyGreeting implements Greeting {
    public void sayHello() {
        System.out.println("Say Hello");
    }
}

class Test {
    public static void main(String args[]) {

        MyGreeting ob = new MyGreeting();

        ob.sayHello();
        ob.sayBye();
    }
}