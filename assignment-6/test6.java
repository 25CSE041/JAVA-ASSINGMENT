import java.util.Scanner;

class Test {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("Enter n:");
        int n = sc.nextInt();

        if (n >= 0 && n <= str.length()) {

            String lastN = str.substring(str.length() - n);

            String result = "";

            for (int i = 0; i < n; i++) {
                result = result + lastN;
            }

            System.out.println("New string: " + result);
        }
        else {
            System.out.println("Invalid n");
        }

        sc.close();
    }
}