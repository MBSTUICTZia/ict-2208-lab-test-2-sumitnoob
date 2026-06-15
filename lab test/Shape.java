package shapes;

public abstract class Shape {

    private String color;
    private boolean filled;

    // Constructor to initialize color and fill status
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Every shape MUST define how to calculate its own area
    public abstract double getArea();

    // Every shape MUST define how to calculate its own perimeter
    public abstract double getPerimeter();

    // Getters and setters
    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Base toString: provides color and fill info
    // Subclasses call super.toString() to reuse this
    @Override
    public String toString() {
        String fillStatus = filled ? "Yes" : "No";
        return "Color : " + color + "\n" +
               "Filled: " + fillStatus;
    }
}
