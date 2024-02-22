package Project2;

public class Tetrahedron extends ThreeDimensionalShape{
    public Tetrahedron(double edgeLength) {
        this.edgeLength = edgeLength;
    }
    public double getEdgeLength() {
        return edgeLength;
    }

    @Override
    public double surfaceArea() {
        return Math.sqrt(3) * edgeLength * edgeLength;
    }

    @Override
    public double volume() {
        return Math.pow(edgeLength, 3) / (6 * Math.sqrt(2));
    }

    @Override
    public String toString() {
        return String.format("Tetrahedron {edge length=%.2f, surface area=%.2f, volume=%.2f}",
                edgeLength, surfaceArea(), volume());
    }
}