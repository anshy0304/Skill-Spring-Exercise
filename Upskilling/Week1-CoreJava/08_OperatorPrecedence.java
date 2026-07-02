class OperatorPrecedence {
    public static void main(String[] args) {
        int resultOne = 10 + 5 * 2;
        int resultTwo = (10 + 5) * 2;
        int resultThree = 100 / 5 + 3 * 4 - 2;

        System.out.println("10 + 5 * 2 = " + resultOne);
        System.out.println("Multiplication happens before addition.");
        System.out.println("(10 + 5) * 2 = " + resultTwo);
        System.out.println("Parentheses happen before multiplication.");
        System.out.println("100 / 5 + 3 * 4 - 2 = " + resultThree);
        System.out.println("Division and multiplication happen before addition and subtraction.");
    }
}
