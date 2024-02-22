package Project2;

public class Tetrahedron extends ThreeDimensionalShape{
    private double edge;

    // Constructor
    public Tetrahedron(double edge) {
        this.edge = edge;
        calculateVolume();
        calculateSurfaceArea();
    }

    // Implementation of abstract methods
    @Override
    void calculateVolume() {
        volume = Math.pow(edge, 3) / (6 * Math.sqrt(2));
    }

    @Override
    void calculateSurfaceArea() {
        surfaceArea = Math.sqrt(3) * Math.pow(edge, 2);
    }
}
