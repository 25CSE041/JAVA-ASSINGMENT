import java.util.Scanner;

class Test {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        if (str.length() >= 2) {
            String s1 = str.substring(1, str.length() - 1);

            System.out.println("Original string: " + str);
            System.out.println("New string: " + s1);
        }
        else {
            System.out.println("String is too short");
        }
    }
}