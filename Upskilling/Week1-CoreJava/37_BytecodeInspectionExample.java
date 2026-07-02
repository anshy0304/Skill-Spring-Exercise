class BytecodeInspectionExample {
    int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        BytecodeInspectionExample example = new BytecodeInspectionExample();
        System.out.println("Square: " + example.square(5));
        System.out.println("Compile with: javac 37_BytecodeInspectionExample.java");
        System.out.println("Inspect with: javap -c BytecodeInspectionExample");
    }
}
