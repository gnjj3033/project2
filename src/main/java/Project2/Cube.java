package Project2;

public class Cube extends ThreeDimensionalShape {
    private double side;

    // Constructor
    public Cube(double side) {
        this.side = side;
    }

    // Implementation of abstract methods
    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public String toString(){
        return String.format("Cube {side=%.2f, surface area=%.2f, volume=%.2f}", side, surfaceArea(), volume());
    }
}
