import java.util.Scanner;

class Test {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st string:");
        String s1 = sc.nextLine();

        System.out.println("Enter 2nd string:");
        String s2 = sc.nextLine();

        String s3 = s1 + s2;

        System.out.println("Original String: " + s3);

        System.out.println("String in lower case: " 
                           + s3.toLowerCase());
    }
}