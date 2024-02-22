package Project2;

abstract class ThreeDimensionalShape {
    protected double volume;
    protected double surfaceArea;

    // Abstract methods to be implemented by subclasses
    abstract void calculateVolume();

    abstract void calculateSurfaceArea();

    // Getter methods for volume and surface area
    public double getVolume() {
        return volume;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    // toString method to display shape information
    @Override
    public String toString() {
        return String.format("%s {volume=%.2f, surface area=%.2f}", this.getClass().getSimpleName(), volume, surfaceArea);
    }
}
