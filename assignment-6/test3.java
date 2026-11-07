import java.util.Scanner;

class Test {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s1 = sc.nextLine();

        int n = s1.length();

        String s2 = s1.substring(0, Math.min(2, n));

        String s3 = "";

        for (int i = 0; i < n; i++) {
            s3 = s3 + s2;
        }

        System.out.println("Original string: " + s1);
        System.out.println("New string: " + s3);
    }
}