package Project2;

public class ShapeDriver {
    public static void main(String[] args) {
        // Instantiate different shapes
        Sphere sphere = new Sphere(2.0);
        Cube cube = new Cube(5.0);
        Cylinder cylinder = new Cylinder(4.0, 1.0);
        Tetrahedron tetrahedron = new Tetrahedron(3.0);

        // Print the state of each shape
        System.out.println(sphere.toString());
        System.out.println(cube.toString());
        System.out.println(cylinder.toString());
        System.out.println(tetrahedron.toString());
    }
}
