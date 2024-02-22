package Project2;

public class ShapeDriver {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(2.0);
        Cube cube = new Cube(5.0);
        Cylinder cylinder = new Cylinder(4.0, 1.0);
        Tetrahedron tetrahedron = new Tetrahedron(3.0);

        System.out.println(sphere);
        System.out.println(cube);
        System.out.println(cylinder);
        System.out.println(tetrahedron);
    }
}
