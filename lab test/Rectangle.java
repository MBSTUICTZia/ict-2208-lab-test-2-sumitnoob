public class Rectangle extends Shape {

    private double width;
    private double length;

    // Constructor passes color and filled up to Shape, then stores own fields
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Area of rectangle = width * length
    @Override
    public double getArea() {
        return width * length;
    }

    // Perimeter of rectangle = 2 * (width + length)
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Getter for width (needed for downcasting demo in ShapeMain)
    public double getWidth() {
        return width;
    }

    // Getter for length (needed for downcasting demo in ShapeMain)
    public double getLength() {
        return length;
    }

    // Full text summary of this rectangle
    // Uses super.toString() so we don't repeat the color/filled logic
    @Override
    public String toString() {
        return "[ Rectangle ]\n"
             + super.toString() + "\n"
             + "Width : " + width + "\n"
             + "Length: " + length + "\n"
             + String.format("Area      : %.2f", getArea()) + "\n"
             + String.format("Perimeter : %.2f", getPerimeter());
    }
}