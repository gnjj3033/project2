package Project2;

public class Cylinder extends ThreeDimensionalShape{
    private double height;
    private double radius;

    // Constructor
    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
        calculateVolume();
        calculateSurfaceArea();
    }

    // Implementation of abstract methods
    @Override
    void calculateVolume() {
        volume = Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    void calculateSurfaceArea() {
        surfaceArea = 2 * Math.PI * radius * (radius + height);
    }

}
