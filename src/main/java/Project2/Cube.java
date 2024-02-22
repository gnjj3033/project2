package Project2;

public class Cube extends ThreeDimensionalShape{
    private double side;

    // Constructor
    public Cube(double side) {
        this.side = side;
        calculateVolume();
        calculateSurfaceArea();
    }

    // Implementation of abstract methods
    @Override
    void calculateVolume() {
        volume = Math.pow(side, 3);
    }

    @Override
    void calculateSurfaceArea() {
        surfaceArea = 6 * Math.pow(side, 2);
    }
}
