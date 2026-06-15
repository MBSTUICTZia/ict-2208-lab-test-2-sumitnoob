package shapes;
public class Circle extends Shape {

    private double radius;

    // Constructor passes color and filled up to Shape, then stores radius
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    // Area of circle = π * r²
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Circumference of circle = 2 * π * r
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Getter for radius (needed for downcasting demo in ShapeMain)
    public double getRadius() {
        return radius;
    }

    // Full text summary of this circle
    // Uses super.toString() so we don't repeat the color/filled logic
    @Override
    public String toString() {
        return "[ Circle ]\n"
             + super.toString() + "\n"
             + "Radius: " + radius + "\n"
             + String.format("Area         : %.2f", getArea()) + "\n"
             + String.format("Circumference: %.2f", getPerimeter());
    }
}
