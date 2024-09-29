public class Cylinder extends Circle {
    private double height; // private variable
    
    // Constructor with default color, radius, and height
    public Cylinder() {
        super(); // call superclass no-arg constructor Circle()
        height = 1.0;
    }
    
    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }
    
    // Constructor with default color, but given radius and height
    public Cylinder(double radius, double height) {
        super(radius); // call superclass constructor Circle(radius)
        this.height = height;
    }
    
    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }
    
    // Override the getArea() method to compute the surface area of the cylinder
    @Override
    public double getArea() {
        // Surface area of cylinder = 2 * PI * radius * height + 2 * base area
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }
    
    // A public method for computing the volume of cylinder
    // use superclass method getArea() to get the base area
    public double getVolume() {
        // Volume = base area * height
        return super.getArea() * height;
    }

    // Override the toString() method
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
