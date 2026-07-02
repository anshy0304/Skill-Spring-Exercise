class TypeCastingExample {
    public static void main(String[] args) {
        double decimalValue = 42.75;
        int integerValue = (int) decimalValue;

        int number = 25;
        double convertedDouble = (double) number;

        System.out.println("Original double: " + decimalValue);
        System.out.println("Double cast to int: " + integerValue);
        System.out.println("Original int: " + number);
        System.out.println("Int cast to double: " + convertedDouble);
    }
}
