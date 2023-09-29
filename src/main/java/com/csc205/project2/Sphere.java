package com.csc205.project2;

public class Sphere extends ThreeDimensionalShape {
    // Constructor for creating a Sphere object
    private double radius;

    // Constructor for creating a Sphere object
    public Sphere() {
        super();  // Call the superclass constructor (if any)
        this.radius = 0.0; // Initialize the radius attribute
    }

    public Sphere(double v) {
        super();
        this.radius = v;
    }
    public double getRadius() {
        return radius;
    }  // Constructor for creating a Sphere object

    public void setRadius(double radius) {
        this.radius = radius;
    }  // Setter method for updating the radius

    // Method to calculate the surface area of the Sphere
    public double surfaceArea() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
        // Explanation: The formula for the surface area of a sphere is 4πr².
    }
    // Method to calculate the volume of the Sphere
    public double volume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }
    // Explanation: The formula for the volume of a sphere is (4/3)πr³.

    // Method to generate a string representation of the Sphere
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sphere {");
        sb.append("radius=").append(radius);  // Include the radius in the string
        sb.append(", surface area=").append(surfaceArea()); // Calculate and include the surface area
        sb.append(", volume=").append(volume()); // Calculate and include the volume
        sb.append('}');
        return sb.toString();
    }
}
