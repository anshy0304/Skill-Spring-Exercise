class Car {
    String make;
    String model;
    int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

class ClassAndObjectCreation {
    public static void main(String[] args) {
        Car firstCar = new Car("Toyota", "Camry", 2022);
        Car secondCar = new Car("Honda", "Civic", 2024);

        firstCar.displayDetails();
        secondCar.displayDetails();
    }
}
