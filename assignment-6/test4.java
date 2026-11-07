import java.util.Scanner;

class FirstHalf {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        if (str.length() % 2 == 0) {

            int half = str.length() / 2;

            String result = str.substring(0, half);

            System.out.println("First half: " + result);
        }
        else {
            System.out.println("null");
        }
    }
}