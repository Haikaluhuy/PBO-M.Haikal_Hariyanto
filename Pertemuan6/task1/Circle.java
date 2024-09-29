public class Circle {
    // private instance variables
    private double radius;
    private String color;  // 1. Tambahkan variabel color bertipe String
    
    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() {
        radius = 1.0;
        color = "red";
    }
    
    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) {
        radius = r;
        color = "red";
    }
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }    
    /** 2. Constructor dengan radius dan color */
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }
    
    /** Returns the radius */
    public double getRadius() {
        return radius;
    }
    
    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius * radius * Math.PI;
    }



    /** 3. Getter untuk color */
    public String getColor() {
        return color;
    }

    /** 3. Setter untuk color */
    public void setColor(String color) {
        this.color = color;
    }
}
