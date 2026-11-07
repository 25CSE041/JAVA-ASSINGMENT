interface NumberPrinter {
    public void printNumber(Integer num);
}

class Num implements NumberPrinter {
    public void printNumber(Integer num) {
        System.out.println("Number: " + num);
    }
}

class Test {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        Num ob = new Num();

        ob.printNumber(num);
    }
}