interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class ShapeFactory {
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}

public class Program {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("Circle");
        shape1.draw();

        Shape shape2 = factory.getShape("Rectangle");
        shape2.draw();
    }
}