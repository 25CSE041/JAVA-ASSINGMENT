class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String s) {
        super(s);
    }
}

class Test {
    public static void main(String args[]) {

        int balance = 1000;
        int withdraw = 1500;

        try {
            if (withdraw > balance) {
                throw new InsufficientBalanceException("Insufficient Balance");
            }

            System.out.println("Withdrawal Successful");
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}