class Test {
    public static void main(String args[]) {

        try {
            int a = 10 / 0;
            System.out.println(a);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }

        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bound");
        }
    }
}