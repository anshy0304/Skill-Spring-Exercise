class PatternMatchingSwitch {
    static String describe(Object value) {
        return switch (value) {
            case Integer number -> "Integer value: " + number;
            case String text -> "String value with length " + text.length();
            case Double decimal -> "Double value: " + decimal;
            case null -> "Null value";
            default -> "Other type: " + value.getClass().getSimpleName();
        };
    }

    public static void main(String[] args) {
        System.out.println(describe(42));
        System.out.println(describe("Java 21"));
        System.out.println(describe(99.5));
        System.out.println(describe(true));
        System.out.println(describe(null));
    }
}
