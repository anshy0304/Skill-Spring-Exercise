class DecompileClassExample {
    String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        DecompileClassExample example = new DecompileClassExample();
        System.out.println(example.greet("Java"));
        System.out.println("Compile this file, then open DecompileClassExample.class in JD-GUI or CFR.");
    }
}
