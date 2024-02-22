package Project2;

public class Sphere extends ThreeDimensionalShape{
    private double radius;

    // Constructor
    public Sphere(double radius) {
        this.radius = radius;
        calculateVolume();
        calculateSurfaceArea();
    }

    // Implementation of abstract methods
    @Override
    void calculateVolume() {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    void calculateSurfaceArea() {
        surfaceArea = 4.0 * Math.PI * Math.pow(radius, 2);
    }
}
