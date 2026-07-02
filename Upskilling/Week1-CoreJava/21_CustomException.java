class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class CustomException {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        int age = 16;

        try {
            validateAge(age);
        } catch (InvalidAgeException exception) {
            System.out.println("Invalid age: " + exception.getMessage());
        }
    }
}
